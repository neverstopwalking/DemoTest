package zookeeper;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * @author zhouzhongjian
 * @date 2019-07-25 16:04
 */
public class ZNodeCreate {
    private static ZooKeeper zoo;
    private static ZookeeperCoonection conn;

    public static void create(String path, byte[] data) throws KeeperException, InterruptedException {
        //创建一个永久性zNode
        zoo.create(path, data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

    }

    public static void main(String[] args) {

        String path = "/mySecondNode";
        byte[] data = "Hello World".getBytes();
        try {
            conn = new ZookeeperCoonection();
            zoo = conn.connect("localhost");


            create(path, data);

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
