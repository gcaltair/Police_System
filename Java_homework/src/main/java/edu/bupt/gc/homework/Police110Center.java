package edu.bupt.gc.homework;

import java.util.ArrayList;

public class Police110Center  implements IllegalEventListener{
    private static Police110Center police110Center =  new Police110Center();
    ArrayList<AbstractPoliceStation> stations = new ArrayList<>();
    private Police110Center(){
        System.out.println("创建110报警中心");
    }
    public void registerTo110Center(AbstractPoliceStation policeStation){
        stations.add(policeStation);
    }
    public static Police110Center getInstance(){
        return police110Center;
    }

    @Override
    public void dealwithIllegalEvent(IllegalEvent event) {
        //从事件对象中取出事件源
        Person person =  (Person)event.source;
        String personCity = person.getAddress().getStrCity();
        //遍历110报警中心注册的所有警察局，寻找与事件源相同城市的警察局
        for(AbstractPoliceStation station: stations){
            if(station.location.getStrCity().equalsIgnoreCase(personCity)){
                station.dealwithIllegalEvent(event);
            }
        }
    }
}
