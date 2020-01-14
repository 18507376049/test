package com.logisticspro.util;

import com.logisticspro.dao.inter.AuthorityManagerDaoInter;
import com.logisticspro.dao.inter.MaxNoManagerDaoInter;
import com.logisticspro.pojo.MaxNo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther: 刘涵
 * @Date: 2019-11-29 15:48
 * @Description:公共的方法
 */
@Component("commandMethod")
public class CommandMethod {

    @Resource(name="maxNoManagerDaoImpl")
    private MaxNoManagerDaoInter maxNoManagerDaoInter =null;

    /**
     * 获得单号最大编号
     * @return String
     */
    public String getOddMaxNo(MaxNo maxNo){

        //存放最大编号
        StringBuilder max = new StringBuilder();

        //获得最大编号表的对象
        MaxNo searchNo = maxNoManagerDaoInter.searchMaxNo(maxNo);

        //获得前缀
        String manPre = searchNo.getManPre();

        //获得前缀的长度
        int manLength = manPre.length();

        //获得当前时间
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//设置日期格式
        String format = df.format(new Date());

        //判断searchNo.getManSort()不为null且长度大于0
        if (null != searchNo.getManMaxNo() && 0 < searchNo.getManMaxNo().length()) {
            //获得最大的编号
            String i = searchNo.getManMaxNo();
            //获得包含日期行
            String substring = i.substring(manLength, 8+manLength);
            //添加前缀和日期
            max.append(manPre + format);

            //判断date等于当天说明已经存在当天的数据否则则无
            if (!format.equals(substring)) {
                //添加后缀
                max.append(searchNo.getManSt());
            } else {
                //获得后缀的长度
                int length = searchNo.getManSt().length();

                //获得不包含日期
                int number = Integer.parseInt(i.substring(manLength+8));
                //累加
                number++;
                //转换为String
                String numberString = number+"";
                //获得数字长度
                int length1 = numberString.length();

                //获得不包含数字的长度添加为0
                int noIncludeNumberLength=length-length1;
                for (int j = 0; j < noIncludeNumberLength; j++) {
                    max.append("0");
                }
                max.append(number);
            }
        }else{//为null
            max.append(manPre+format+searchNo.getManSt());
        }
        return max.toString();

    }

    /**
     *查询普通编号
     * @param maxNo
     * @return
     */
    public String getPuMaxNo(MaxNo maxNo){

        //获得对象
        MaxNo searchNo = maxNoManagerDaoInter.searchMaxNo(maxNo);

        //声明最大编号
        StringBuilder max = new StringBuilder();


        //判断searchNo.getManSort()不为null且长度大于0

        if(null != searchNo){
            if (null != searchNo.getManMaxNo() && 0 < searchNo.getManMaxNo().length()) {
                //获得前缀
                String manPre = searchNo.getManPre();

                //获得后缀
                String manSt = searchNo.getManSt();

                //添加前缀
                max.append(manPre);

                //获得最大的编号
                String i = searchNo.getManMaxNo();

                //获得前缀的长度
                int preLenght = manPre.length();

                //获得后缀的长度
                int stLength = manSt.length();

                //获得最大编号中的数字
                int number = Integer.parseInt(i.substring(preLenght))+1;

                //将得到最大编号的数字转换为String
                String numberString = number+"";

                //获得数字长度
                int length1 = numberString.length();

                //获得不包含数字的长度添加为0
                int noIncludeNumberLength=stLength-length1;

                for (int j = 0; j < noIncludeNumberLength; j++) {
                    max.append("0");
                }
                max.append(number);
            }else{//为null

                //获得前缀
                String manPre = searchNo.getManPre();

                //获得后缀
                String manSt = searchNo.getManSt();

                max.append(manPre+manSt);
            }
        }
        return max.toString();
    }

    /**
     * 查询该字符串是否包含数字
     * @param str
     * @return
     */
    public boolean isNumeric(String str) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }

    /**
     * 修改最大编号
     * @param maxNo 条件
     * @return int
     */
    public int updateMax(MaxNo maxNo){
        int rows=maxNoManagerDaoInter.excuteUpdateMaxNo(maxNo);
        return rows;
    }
}
