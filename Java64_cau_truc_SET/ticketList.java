package Java64_cau_truc_SET;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ticketList {
    Set<String> ticketList = new HashSet<String>();

    public ticketList() {

    }
    public boolean addTicket(String value){
        return this.ticketList.add(value);
    }

    public boolean deleteTicket(String value){
        return this.ticketList.remove(value);
    }

    public boolean checkTicket(String value){
        return this.ticketList.contains(value);
    }

    public void deleteAll(){
        this.ticketList.clear();
    }

    public int displaylength(){
        return this.ticketList.size();
    }

    public String play(){

        Random rd = new Random();
        int index = rd.nextInt(this.displaylength());

        return (String) this.ticketList.toArray()[index];
    }
}
