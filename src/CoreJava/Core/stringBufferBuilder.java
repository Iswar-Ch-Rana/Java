package CoreJava.Core;

public class stringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello Java");
        stringBuilder.append(" Bitu");
        stringBuilder.append(" 35");

        System.out.println(stringBuilder.reverse());

//        Thread t1 = new Thread(() -> {
//            for (int i = 0 ; i < 2000 ; i++){
//                stringBuffer.append("A");
////                stringBuilder.append("A");
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0 ; i < 2000 ; i++){
//                stringBuffer.append("B");
////                stringBuilder.append("B");
//
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(stringBuffer.length());
    }
}
