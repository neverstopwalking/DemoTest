package zookeeper;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;

/**
 * @author zhouzhongjian
 * @date 2019-07-25 16:41
 */
public class ZNodeExists {

    private static ZookeeperCoonection conn;
    private static ZooKeeper zoo;

    public static Stat zNodeExists(String path) throws KeeperException, InterruptedException {
        return zoo.exists("path", true);
    }

    public static void main(String[] args) {
        conn = new ZookeeperCoonection();
        String path = "/mySecondNode";
        try {
            zoo = conn.connect("localhost");
            Stat stat = zNodeExists(path);
            if (stat != null) {
                System.out.println("the version is" + stat.getVersion());

            } else {
                System.out.println("the stat is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
