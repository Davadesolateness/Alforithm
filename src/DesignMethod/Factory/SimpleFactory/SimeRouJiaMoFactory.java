package DesignMethod.Factory.SimpleFactory;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/4/7 16:54
 * @Version 1.0
 */
public class SimeRouJiaMoFactory {
    public RoujiaMo createRouJiaMo(String type)
    {
        RoujiaMo rouJiaMo = null;
        if (type.equals("Suan"))
        {
            rouJiaMo = new SuanRouJiaMo();

        } else if (type.equals("Tian"))
        {
            rouJiaMo = new TianRouJiaMo();
        } else if (type.equals("La"))
        {
            rouJiaMo = new LaRouJiaMo();
        }
        return rouJiaMo;
    }
}
