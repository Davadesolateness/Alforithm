package Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Author ：dong
 * @Date ：Created in 2020/3/23 12:45
 * @Version 1.0
 */
public class ShowBug {
    public static class ShowMeBug {
        /**
         * 要求对这组数据进行数据转换和计算处理，按照日期(精确到天)和病人分类数据, 用控制台输出即可
         * 输出示例:
         * 2020-01-23 2020-01-24 2020-01-25 2020-01-26
         * 张三 36.5       36.3       ...        ...
         * ...   ...       ...         ...         ...
         * 要求:
         * 1. 日期从小到大输出,
         * 2. 如果病人当日没有测试温度, 统一认为是 36.5 摄氏度(可以在控制台打出36.5)
         * 3. 计算平均温度, 并按照温度从高到低排序
         * 4. 日期不用与温度对齐, 输出顺序正确即可
         */
        public static void main(String[] args) {
            List<PatientTemperatureVo> patientList = getPatientList();
            // TODO 请编写代码实现题目要求
            PatientTemperatureVo patientTemperatureVo;
            int size = patientList.size();
            for (int i = 0; i < size; i++) {
                patientTemperatureVo = patientList.get(i);
                if (patientTemperatureVo.getName()=="张三"){
                    
                }
            }

        }
        static class PatientTemperatureVo {
            public String name;
            public String dateStr;
            public double temperature;

            public PatientTemperatureVo(String name, String dateStr, double temperature) {
                this.name = name;
                this.dateStr = dateStr;
                this.temperature = temperature;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDateStr() {
                return dateStr;
            }

            public void setDateStr(String dateStr) {
                this.dateStr = dateStr;
            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }
        }

        static List<PatientTemperatureVo> getPatientList() {
            List<PatientTemperatureVo> list = new ArrayList<>();
            list.add(new PatientTemperatureVo("赵六", "2020-01-25 12:13:26", 37.2));
            list.add(new PatientTemperatureVo("王五", "2020-01-25 12:13:26", 36.5));
            list.add(new PatientTemperatureVo("张三", "2020-01-24 12:25:26", 36.2));
            list.add(new PatientTemperatureVo("李四", "2020-01-25 12:24:26", 36.5));
            list.add(new PatientTemperatureVo("李四", "2020-01-24 21:13:25", 36.9));
            list.add(new PatientTemperatureVo("张三", "2020-01-25 11:13:26", 36.7));
            list.add(new PatientTemperatureVo("张三", "2020-01-27 12:13:26", 36.3));
            list.add(new PatientTemperatureVo("张三", "2020-01-28 12:35:23", 36.4));
            list.add(new PatientTemperatureVo("李四", "2020-01-27 13:15:26", 37));
            list.add(new PatientTemperatureVo("李四", "2020-01-23 15:13:26", 36.6));
            list.add(new PatientTemperatureVo("赵六", "2020-01-24 12:13:26", 36.9));
            list.add(new PatientTemperatureVo("王五", "2020-01-27 12:25:54", 36.4));
            list.add(new PatientTemperatureVo("李四", "2020-01-26 12:13:26", 36.2));
            list.add(new PatientTemperatureVo("李四", "2020-01-28 19:13:26", 36.1));
            list.add(new PatientTemperatureVo("黄七", "2020-01-23 12:13:26", 36.9));
            list.add(new PatientTemperatureVo("黄七", "2020-01-26 06:13:26", 37.5));
            list.add(new PatientTemperatureVo("王五", "2020-01-23 12:13:26", 36.2));
            list.add(new PatientTemperatureVo("王五", "2020-01-24 18:13:21", 36.9));
            list.add(new PatientTemperatureVo("刘八", "2020-01-26 12:13:26", 36.8));
            list.add(new PatientTemperatureVo("黄七", "2020-01-25 12:13:26", 37.2));
            list.add(new PatientTemperatureVo("黄七", "2020-01-28 12:13:26", 35.9));
            list.add(new PatientTemperatureVo("赵六", "2020-01-26 12:14:26", 37.5));
            list.add(new PatientTemperatureVo("刘八", "2020-01-25 17:13:23", 36.5));
            list.add(new PatientTemperatureVo("王五", "2020-01-26 12:13:26", 36.8));
            list.add(new PatientTemperatureVo("王五", "2020-01-28 12:13:26", 36.1));
            list.add(new PatientTemperatureVo("赵六", "2020-01-27 08:12:46", 37.9));
            list.add(new PatientTemperatureVo("黄七", "2020-01-24 12:13:26", 37.1));
            list.add(new PatientTemperatureVo("黄七", "2020-01-27 12:43:26", 37.1));
            list.add(new PatientTemperatureVo("刘八", "2020-01-23 11:13:26", 36.1));
            list.add(new PatientTemperatureVo("刘八", "2020-01-28 12:13:26", 36.3));
            list.add(new PatientTemperatureVo("张三", "2020-01-23 12:13:26", 36.5));
            return list;
        }
    }

}
