package zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author zhouzhongjian
 * @date 2019-07-25 15:37
 */
public class ZookeeperCoonection {
    private ZooKeeper zoo;
    final CountDownLatch connectedSignal = new CountDownLatch(1);

    //创建和zookeeper的连接
    public ZooKeeper connect(String path) throws IOException, InterruptedException {
        zoo = new ZooKeeper(path, 5000, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                if (watchedEvent.getState() == Event.KeeperState.SyncConnected) {
                    connectedSignal.countDown();
                }


            }
        });

        connectedSignal.await();
        return zoo;
    }

    //断开连接
    public void close() throws InterruptedException {
        zoo.close();
    }

}
