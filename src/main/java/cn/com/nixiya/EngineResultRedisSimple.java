package cn.com.nixiya;

public class EngineResultRedisSimple {

    //false 表示引擎结果不能获取  , true 表示能获取
     private volatile boolean simpless =  false;

     private  boolean update(){
         return simpless;
     }

//     private synchronized void hasUpdate(){
//         simpless =
//     }



    public static void main(String[] args) {
        EngineResultRedisSimple engineResultRedisSimple = new EngineResultRedisSimple();
        engineResultRedisSimple.update();
        engineResultRedisSimple.update();
        engineResultRedisSimple.update();
        engineResultRedisSimple.update();
    }

}
