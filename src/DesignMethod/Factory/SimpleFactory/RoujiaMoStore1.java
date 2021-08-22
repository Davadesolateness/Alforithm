package DesignMethod.Factory.SimpleFactory;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 16:55
 * @Version 1.0
 */
public class RoujiaMoStore1 {
    private SimeRouJiaMoFactory factory;

    public RoujiaMoStore1(SimeRouJiaMoFactory factory){
        this.factory = factory;
    }
    /**
     * 根据传入类型卖不同的肉夹馍
     *
     * @param type
     * @return
     */
    public RoujiaMo sellRouJiaMo(String type){
        RoujiaMo roujiaMo = factory.createRouJiaMo(type);
        roujiaMo.prepare();
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
