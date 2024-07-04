package edu.bupt.gc.homework;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public  static void main(String[] args) throws Exception {
        Police110Center police110Center = Police110Center.getInstance();
        String xml = "myconfig.xml";
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(xml);
        //创建警察局，并注册
        PoliceStation policeStation1 = (PoliceStation) context.getBean("policeStation1");
        policeStation1.setRegManager(new PersonRegManager());
        police110Center.registerTo110Center(policeStation1);
        PoliceStation policeStation2 = (PoliceStation) context.getBean("policeStation2");
        policeStation2.setRegManager(new PersonRegManagerB(new PersonRegManager()));
        police110Center.registerTo110Center(policeStation2);
        //创建居民张三、李四，在江城警察局登记
        Resident zhangsan = (Resident) context.getBean("resident1");
        zhangsan.addIllegalEventListener(police110Center);
        policeStation1.registerResident(zhangsan);
        Resident lisi = (Resident) context.getBean("resident2");
        lisi.addIllegalEventListener(police110Center);
        policeStation1.registerResident(lisi);
        //创建居民王五，在海城公安局登记
        Resident wangwu = (Resident) context.getBean("resident3");
        wangwu.addIllegalEventListener(police110Center);
        policeStation2.registerResident(wangwu);
        System.out.println(".....");

        //创建警察
        Police police1 = (Police) context.getBean("police1");
        Police police2 = (Police) context.getBean("police2");
        Police police3 = (Police) context.getBean("police3");
        //警察1加入江城警察局
        policeStation1.employ(police1);
        policeStation1.employ(police2);
        //警察2加入海城警察局
        policeStation2.employ(police3);
        //强盗抢劫张三
        Robber robber1 = (Robber) context.getBean("robber1");
        robber1.illegalAct(zhangsan);
        //小偷偷窃王五
        Thief thief1 = (Thief) context.getBean("thief1");
        thief1.illegalAct(wangwu);
        //诈骗犯诈骗李四
        Cheater cheater1=(Cheater) context.getBean("cheater1");
        cheater1.illegalAct(lisi);

        policeStation1.printPersonRegManager();
        policeStation2.printPersonRegManager();

    }

}
