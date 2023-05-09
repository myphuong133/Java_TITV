package Java64_cau_truc_SET;

import Java65_cau_truc_Map.Dictionary;

import java.util.Scanner;

public class Java65_dictionary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        int option ;
        do {
            System.out.println("----------MENU-----------" + "\n"
                    + "(1). Thêm từ (Tiếng anh, Tiếng việt)" + "\n"
                    + "(2). Xoá từ" + "\n"
                    + "(3). Tra từ" + "\n"
                    + "(4). In ra danh sách các từ tiếng anh" + "\n"
                    + "(5). In ra các từ tiếng việt" + "\n"
                    + "(6). Số lượng ừ trong từ điển" + "\n"
                    + "(7). Xoá toàn bộ" + "\n"
            );

            option = sc.nextInt(); sc.nextLine();

            if (option == 1){
                System.out.println("Nhập vào từ tiếng anh: ");
                String english = sc.nextLine();
                System.out.println("Nhập vào nghĩa: ");
                String vietNam = sc.nextLine();
                dictionary.addWord(english,vietNam);
            } else if (option == 2 || option == 3) {
                System.out.println("Nhập vào từ khoá");
                String english = sc.nextLine();
                if (option == 2){
                    dictionary.deleteThisWord(english);
                    if (dictionary.checkKey(english)){
                        System.out.println("Không thành công");
                    }
                    else {
                        System.out.println("Xoá key thành công!");
                    }
                }
                else {
                    System.out.println("ý nghĩa: " + dictionary.translateEngToVn(english));
                }
            } else if (option == 4) {
                dictionary.displayKey();
            } else if (option == 5) {
                dictionary.displayValue();
            }
            else if (option == 6){
                System.out.println(dictionary.takeSize());
            }
            else {
                dictionary.deleteAll();
            }

        }while (option != 0);
    }
}
