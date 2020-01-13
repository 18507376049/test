//动态日期
function getDate() {
    var today = new Date();
    var date = today.getFullYear() + "年" + twoDigits(today.getMonth() + 1) + "月" + twoDigits(today.getDate()) + "日";
    var week = " 星期" + "日一二三四五六 ".charAt(today.getDay());
    var time = twoDigits(today.getHours()) + ":" + twoDigits(today.getMinutes()) + ":" + twoDigits(today.getSeconds());
    $("#font_3").html(date + " " + time+week);
}

function twoDigits(val) {
    if (val < 10) return "0" + val;
    return val;
}
//注意：导航 依赖 element 模块，否则无法进行功能性操作
layui.use('element', function () {
    var element = layui.element;

    //引入底层的jqurey
    var $ = layui.jquery;


    //按照指定的周期(以毫秒计)来调用函数
    setInterval(getDate, 1000);

    //获得名字：建议获得全部信息
    $.post("/userManager/searchLoginName.action", function(data){
        $('#loginName').text(data);
    });

    $(function () {
        //获得菜单
        $.ajax({
            type: "GET",
            url: "/userManager/excuteSearchMunu.action",
            dataType: "json",
            success: function (data) {
                //声明变量 listInfo 存储循环的数据
                var listInfo = "";
                var c=0;
                //循环编写需要的html语句
                for(var key in data){
                    var value=data[key];
                    listInfo += "<li class='layui-nav-item'>" +
                        "<a href='javascript:;' ><i class=\"fa fa-plug iconfont "+value.autButton+"\" aria-hidden=\"true\" ></i><span> " + key + "</span></a>" +
                        "  <dl class=\"layui-nav-child\"> ";
                    //根据键获得值

                    for(var i=0;i<value.authority.length; i++){
                        c++;
                            listInfo+=
                                "<dd><a href=\"javascript:;\"  kit-target lay-id='"+value.authority[i].autName+"' " +
                                " data-options=\"{url:'"+value.authority[i].autUrl+"',icon:'',title:'"+value.authority[i].autName+"',id:'"+c+"'}\" '>" +
                                "<i class=\"iconfont fa fa-plug "+value.authority[i].autButton+"\" aria-hidden=\"true\"></i>" +
                                "&nbsp;&nbsp;"+value.authority[i].autName+"</a></dd>"
                    }
                    listInfo +="</dl></li>"
                }
                //为menu赋值

                $("#menu").html(listInfo);
                element.render('nav');
            }
        });
    });
});