package DesignMethod.Factory.SimpleFactory;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 17:09
 * @Version 1.0
 */
public abstract class RoujiaMoStore2 {
    public abstract RoujiaMo createRouJiaMo(String type);

    /**
     * 根据传入类型卖不同的肉夹馍
     *
     * @param type
     * @return
     */
    public RoujiaMo sellRouJiaMo(String type)
    {
        RoujiaMo rouJiaMo = createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
