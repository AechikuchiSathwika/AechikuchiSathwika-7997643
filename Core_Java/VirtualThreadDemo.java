class VirtualThreadDemo {
    public static void main(String[] args)
            throws Exception {

        long start = System.currentTimeMillis();
        for(int i = 1; i <= 100000; i++) {
            int num = i;
            Thread.startVirtualThread(() -> {
                if(num == 100000) {
                    System.out.println(
                        "Last Virtual Thread Executed"
                    );
                }
            });
        }
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println(
            "Time Taken: " + (end - start) + " ms"
        );
    }
}