package Java64_cau_truc_SET;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class rut_tham_trung_thuong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ticketList ticketList = new ticketList();

        int option = 0;
        do {
            System.out.println("--------------MENU--------------");
            System.out.println("1. Thêm mã số dự thưởng");
            System.out.println("2. Xoá mã số dự thưởng");
            System.out.println("3. Kiểm tra mã số dự thưởng");
            System.out.println("4. Xoá hết mã số dự thưởng");
            System.out.println("5. Số lượng phiếu dự thưởng");
            System.out.println("6. Bôc thăm trúng thưởng");
            System.out.println("7. Toàn bộ mã");
            option = sc.nextInt();
            if(option == 1 || option ==2 || option == 3){
                System.out.println("Nhập vào mã phiếu dự thưởng");
                sc.nextLine();
                String value = sc.nextLine();
                if (option == 1){
                    int sizeCheck = ticketList.displaylength();
                    ticketList.addTicket(value);
                    if (sizeCheck < ticketList.displaylength()){
                        System.out.println("Đã thêm mã thành công");
                    }
                    else {
                        System.out.println("Mời thêm lại từ đầu");
                    }
                }
                else if (option == 2){
                    int sizeCheck = ticketList.displaylength();
                    ticketList.deleteTicket(value);
                    if (sizeCheck > ticketList.displaylength()){
                        System.out.println("Đã xoá mã thành công");
                    }
                    else {
                        System.out.println("Mời thêm lại từ đầu");
                    }
                }
                else if (option == 3){
                    ticketList.checkTicket(value);
                }
            } else if (option == 4) {
                ticketList.deleteAll();
            } else if (option == 5) {
                System.out.println(ticketList.displaylength());

            }
            else if (option == 6){
                if (ticketList.displaylength() != 0){
                    System.out.println("Người chiến thắng là: " + ticketList.play());
                }
                else {
                    System.out.println("Thêm mã đã dm ");
                }

            }
            else if (option == 7){
                System.out.println(Arrays.toString(ticketList.ticketList.toArray()));
            }

        }while (option!=0);
    }
}
