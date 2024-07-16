//Global&Local Variable
class variable{
    public static void main(String[] args){
        //Global variable
        int a = 100;
        {
            //local variable
            int b = 200; //ขอบเขตของ b อยู่ภายใต้ปีกกา 5-9
            System.out.println(a);
            System.out.println(b);
        }
        // System.out.println(b); --> ไม่สามารถทำได้ เพราะ b is not in this scope

        //Check ค่าต่ำ - สุงสุด ของชนิดตัวแปร
        System.out.println(Byte.MIN_VALUE); //MIN_VALUE ตัวพิมพ์ใหญ่แสดงว่าเป็นค่าคงที่
        System.out.println(Integer.MAX_VALUE); //Integer เริ่มด้วยตัวพิมพ์ใหญ่ เพราะเป็น class
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }
}