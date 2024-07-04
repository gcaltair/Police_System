package edu.bupt.gc.homework;

import java.util.Random;

public class PoliceStation extends AbstractPoliceStation{
    public PoliceStation() {
    }

    public PoliceStation(Address location) {
        super(location);
        System.out.println("创建"+this.getStationName());
    }
//    public void println()
//    {
//        System.out.println("警局: "+location.getStrCity()+" 警察局 \n注册居民的列表:");
//        for(Person i:residents)
//            System.out.println("居民姓名: "+i.getFullName()+" 地址: "+i.getFullAddress()+" 注册警局: "+this.getStationName());
//        System.out.println("注册的警察列表: ");
//        for(Police j:polices)
//            System.out.println("警察姓名: "+j.getFullName()+" 地址: "+j.getFullAddress()+" 任职警局: "+this.getStationName());
//        System.out.println();
//    }

    @Override
    public boolean checkIDCard(Person person) {
        System.out.println(person.getFullName()+"在"+this.getStationName()+"检查身份证");
        if(person.getIdCard().length()!=18) {
            System.out.println(person.getFullName() + "在" + this.getStationName() + "检查身份证失败");
            return false;
        }
        System.out.println(person.getFullName()+"在"+this.getStationName()+"检查身份证成功");
        return true;
    }

    @Override
    public void takePhoto(Person person) {
        System.out.println(person.getFullName()+"在"+this.getStationName()+"拍照");
    }

 //   @Override
//    public void establishArchive(Person person) {
//        System.out.println(person.getFullName()+"在"+this.getStationName()+"建立档案");
//
//    }

    @Override
    public void dealwithIllegalEvent(IllegalEvent event) {
        //1.警察局挑选警察，处理事件
        Random rand = new Random();
        int MAX = this.polices.size()-1;
        int MIN = 0;
        int idx = rand.nextInt((MAX - MIN + 1) )+ MIN;
        Police police = polices.get(idx);
        //2.警察处理案件
        IIllegal illegal = (IIllegal) event.getOffender();
        int crimeCode = illegal.getCrimeCode();
        if(crimeCode == IIllegal.CREAME_CODE_ROB) {
            System.out.println(this.getStationName()+"命令"+
                    police.getFullName()+"处理抢劫犯罪");
            Robber robber = (Robber)illegal;
            police.arrest(robber);
            System.out.println("警察"+police.getFullName()+"追捕强盗"+robber.getFullName());
        }
        if(crimeCode == IIllegal.CREAME_CODE_STEAL) {
            System.out.println(this.getStationName()+"命令"+
                    police.getFullName()+"处理偷窃犯罪");
            Thief thief = (Thief) illegal;
            police.arrest(thief);
            System.out.println("警察"+police.getFullName()+"追捕小偷"+thief.getFullName());
        }
        if(crimeCode == IIllegal.CREAME_CODE_CHEAT) {
            System.out.println(this.getStationName()+"命令"+
                    police.getFullName()+"处理诈骗犯罪");
            Cheater cheater = (Cheater) illegal;
            police.arrest(cheater);
            System.out.println("警察"+police.getFullName()+"追捕诈骗犯"+cheater.getFullName());
        }
    }
}
