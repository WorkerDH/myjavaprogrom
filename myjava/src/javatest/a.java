package javatest;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] information={
	         { "张三", "jdiansf32435", "15635446544", "成都"},
	           { "李四","fgdhe436536", "1235796443", "上海"},
	         { "王二麻子", "ert345yhnf", "23435567", "达州	"},
	        { "黄老板", "34trgnfh4", "8208820", "广州"},
			};
		for(var i in information){
			   console.dir(i);//输出姓名
			   console.dir(information[i]);//输出分数
			}
	}

}
