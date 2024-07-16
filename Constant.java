class Constant{
    public static void main(String[] args){
        // ตั้งชื่อค่าคงที่ด้วยตัวพิมพ์ใหญ่ทั้งหมด
        // เติมนำหน้าว่า final เพื่อบอกว่ามันเป็นค่าคงที่ ไม่สามารถเปลี่ยนแปลงได้
        final double PI = 3.1415926;
        final int WEIGHT = 10;
        // WEIGHT = 20; --> Error!! เพระาค่าคงที่ไม่สามารถเปลี่ยนค่าได้
        System.out.println("pi = " + PI + " weight = " + WEIGHT);
    }
}