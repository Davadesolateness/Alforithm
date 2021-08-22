package DesignMethod.Factory.SimpleFactory;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 16:40
 * @Version 1.0
 */
//简单工厂模式
public class RoujiaMoStore {


    /**
     *根据传入类型不同的肉夹馍
     *
     * @param type
     * @return
     */
    public RoujiaMo sellRouJiaMo(String type){
        RoujiaMo roujiamo = null;

        if (type.equals("Suan")){
            roujiamo = new SuanRouJiaMo();
        }else if(type.equals("Tian")){
            roujiamo = new TianRouJiaMo();
        }else if(type.equals("La")){
            roujiamo = new LaRouJiaMo();
        }

        roujiamo.prepare();;
        roujiamo.fire();
        roujiamo.pack();
        return roujiamo;
    }
}
