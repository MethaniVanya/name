package setterexamples;


public static void main(String[] args) {
	// TODO Auto-generated method stub
	ApplicationContext context=new ClassPathXmlApplicationContext("QBMap.xml");
	Example q1=(Example)context.getBean("qb");
	q1.showAnswers();
	}