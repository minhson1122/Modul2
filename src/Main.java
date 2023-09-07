import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập tuổi : ");
//        int age = input.nextInt();
//        System.out.println("tuổi của bạn là : " + age);


//        String minhson = "HelloWord";
//        String son = "hi ae";
//        System.out.println(minhson+"\n"+son);


//        int songuyen = 4;
//        int a = 8;
//        if (songuyen == a){
//            System.out.println("bằng nhau");
//        }else {
//            System.out.println("hai số khác nhau");
//        }


//        int a = 5;
//         a *= 8;
//         int b = a;
//        System.out.println(b);

//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        System.out.println("tôi tên là : " + name);
//        int age = input.nextInt();
//        System.out.println("năm nay tôi : " + age + " tuổi" );


//        Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đó
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập a");
//        int a = input.nextInt();
//        System.out.println("nhập b");
//        int b = input.nextInt();
//        System.out.println("nhập c");
//        int c = input.nextInt();
//        if (a > b) {
//            if (a > c){
//                System.out.println(a);
//            }
//        }
//        if (b > c){
//            System.out.println(b);
//        }else {
//            System.out.println(c);
//        }


//        Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
//        Scanner input = new Scanner(System.in);
//        System.out.println(" nhập điểm kiểm tra");
//        int Diemkt = input.nextInt();
//        System.out.println("nhập điểm giữa kì");
//        int Diemgiuaki = input.nextInt();
//        System.out.println("nhập điểm cuối kì ");
//        int Diemcuoiki = input.nextInt();
//        double Tongdiem = (Diemkt + Diemgiuaki + Diemcuoiki) / 3;
//        if (Tongdiem >= 8 && Tongdiem <= 10) {
//            System.out.println("Xếp hạng giỏi");
//        }
//        if (Tongdiem >= 6 && Tongdiem < 8) {
//            System.out.println(" Xếp hạng khá");
//        }
//        if (Tongdiem >= 4 && Tongdiem < 5) {
//            System.out.println(" Xêp hạng trung bình ");
//        }
//        if (Tongdiem < 4) {
//            System.out.println("xếp hạng yếu ");
//        }


//        Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng, nếu doanh số lớn hơn 100k thì hoa hồng nhận được là 10%, nếu lớn hơn 200k thì nhận 15%, lớn hơn 1000k thì nhận 50%
//        Scanner input = new Scanner(System.in);
//        double hoahong = 0;
//        int doanhSo = input.nextInt();
//        if (doanhSo >= 100 && doanhSo < 200) {
//            hoahong = (0.1) * doanhSo;
//            System.out.println("hoa hồng của bạn là :" + hoahong);
//        } else if (doanhSo >= 200 && doanhSo < 1000) {
//            hoahong = (0.15) * doanhSo;
//            System.out.println("hoa hồng của bạn là :" + hoahong);
//        } else if (doanhSo >= 1000) {
//            hoahong = (0.5) * doanhSo;
//            System.out.println("hoa hồng của bạn là :" + hoahong);
//        }

//cách 2
//        Scanner input = new Scanner(System.in);
//        double hoahong;
//        System.out.println("doanh số");
//        int doanhSo = input.nextInt();
//        System.out.println("phần trăm");
//        int phanTram = input.nextInt();
//        hoahong = (doanhSo * phanTram) / 100;
//        System.out.println("hoa hồng của bạn là :" + hoahong);


//        Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
//        a,b,c > 0
//        a + b > c
//        b + c > a
//        a + c > b
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập cạnh a");
//        int canhA = input.nextInt();
//        System.out.println("nhập cạnh b");
//        int canhB = input.nextInt();
//        System.out.println("nhập cạnh c");
//        int canhC = input.nextInt();
//        if (canhA > 0 && canhB > 0 && canhC > 0) {
//            if (canhA + canhB > canhC && canhB + canhC > canhA && canhA + canhC > canhB) {
//                System.out.println("thỏa mãn điều kiện cạnh tam giác");
//            } else {
//                System.out.println("không thỏa mãn 2");
//            }
//        } else {
//            System.out.println("không thỏa mãn cạnh tam giác");
//        }
//
//
//        if (canhA > 0 && canhB > 0 && canhC > 0 && canhA + canhB > canhC && canhB + canhC > canhA && canhA + canhC > canhB) {
//            System.out.println("thỏa mãn");
//        } else {
//            System.out.println("không thỏa mãn");
//        }

//        Bài 7: Tính cước điện thoại cho một hộ gia đình với các thông số đã cho
//        Scanner input = new Scanner(System.in);
//        double Tongtien;
//        System.out.println("số phút đã dùng");
//        int pdaDung = input.nextInt();
//        System.out.println("cước dt");
//        int Cuoc = input.nextInt();
//        Tongtien = pdaDung * Cuoc;
//        System.out.println(" Bạn phải thanh toán :" + Tongtien);


//        Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập độ c");
//        int doC = input.nextInt();
//        double chuyenDoi = doC * 9 / 5 + 32;
//        System.out.println(" độ F bằng :" + chuyenDoi);


//        Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
//        int met;
//        double chuyenDoi;
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhập mét");
//        met = input.nextInt();
//        chuyenDoi = met * 3.28;
//        System.out.println("số feet bằng :" + chuyenDoi);


//        Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không.
//        Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0
//
        }
    }

