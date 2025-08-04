package com.design.pattern;

import com.design.pattern.abstactFactory.*;
import com.design.pattern.builder.Pizza;
import com.design.pattern.factory.Car;
import com.design.pattern.factory.CarFactory;
import com.design.pattern.factory.CarType;
import com.design.pattern.factory.InvalidCarTypeException;
import com.design.pattern.prototype.ConiferousTree;
import com.design.pattern.prototype.DeciduousTree;
import com.design.pattern.prototype.Tree;
import com.design.pattern.singleton.Animal;
import com.design.pattern.singleton.Employee;
import com.design.pattern.singleton.Labor;
import com.design.pattern.singleton.Student;
import com.design.pattern.strcutural.bridge.*;
import com.design.pattern.structural.adapter.AudioPlayer;
import com.design.pattern.structural.adapter.example2.ChargerAdapter;
import com.design.pattern.structural.adapter.example2.Laptop;
import com.design.pattern.structural.adapter.example2.UsbCCharger;
import com.design.pattern.structural.decorator.BasePizza;
import com.design.pattern.structural.decorator.ChickenSupreme;
import com.design.pattern.structural.decorator.ExtraCheese;
import com.design.pattern.structural.decorator.ExtraChicken;
import com.design.pattern.structural.decorator.example2.ChocolateSyrup;
import com.design.pattern.structural.decorator.example2.IceCream;
import com.design.pattern.structural.decorator.example2.VanillaCone;
import com.design.pattern.structural.facade.EmailService;
import com.design.pattern.structural.facade.HotelFacade;
import com.design.pattern.structural.facade.PaymentService;
import com.design.pattern.structural.facade.RoomService;
import com.design.pattern.structural.proxy.ProxyInternetAccess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class PatternApplication {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		SpringApplication.run(PatternApplication.class, args);

		System.out.println("Singleton pattern ahead !!!");
		System.out.println("Lazy initialization !!!");
		Employee e= Employee.getEmployee();

		System.out.println(e.hashCode());

		Employee e1= Employee.getEmployee();

		System.out.println(e1.hashCode());

		Employee e2= Employee.getEmployee();

		System.out.println(e2.hashCode());

		Employee e3= Employee.getEmployee();

		System.out.println(e3.hashCode());

		System.out.println("Eager initialization !!!");
		Student s= Student.getStudent();
		System.out.println(s.hashCode());
		Student s1= Student.getStudent();
		System.out.println(s1.hashCode());


		//Thread safe
		System.out.println("Thread Safe initialization !!!");
		Labor l=Labor.getLabor();
		Labor l1= Labor.getLabor();
		System.out.println(l.hashCode());
		System.out.println(l1.hashCode());



		System.out.println("Reflection API - singleton class !!");
		Animal animal= Animal.getAnimal();
//		Constructor<Animal> constructor = Animal.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		Animal newInstance = constructor.newInstance();

		//Streaming examples


		//1. Sum of Odd Numbers

		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);

		int result = nums.stream().filter(n->n%2!=0).reduce(0,(a,b)->a+b);

		System.out.println("Sum of odd numbers: - "+result);



		// 2. Total characters in all List
		List<String> names = List.of("Prapti", "Boo", "Java");

		int totalCharacters = names.stream().map(name->name.length())
						.reduce(0,(a,b)->a+b);

		System.out.println("total characters in list :- "+totalCharacters);


		// 3. Total elements in all list
		List<String> namesList = List.of("Prapti", "Boo", "Java","Hello","World");

		Long totalElements = namesList.stream().count();

		System.out.println("total elements in list :- "+totalElements);

		// 4. Total distinct elements in all list
		List<String> namesList1 = List.of("Prapti", "Boo", "Java","Hello","World","Boo","Java");

		Long disitnctCount = namesList1.stream().distinct().count();

		System.out.println("total disitnct elements in list :- "+disitnctCount);


		//5. Join names with a comma
		List<String> namesComma = List.of("Prapti", "Boo", "Java");
		String resultComma = namesComma.stream().collect(Collectors.joining(", "));
		System.out.println(resultComma);


		//Factory Design pattern

		System.out.println("Factory Design Pattern");

		try
		{
			Car car1= CarFactory.getCar(CarType.LUXURY);
			car1.drive();

			Car car2= CarFactory.getCar(CarType.CHEAP);
			car2.drive();

//			Car car3= CarFactory.getCar("LuxuryScoda");
//			car3.drive();
		}
		catch (InvalidCarTypeException invalidCarTypeException)
		{
			System.out.println(invalidCarTypeException.getMessage());
		}

    // Abstract factory
		System.out.println("Abstract Factory Design Pattern ---- ");
		String whichOs="Mac";
		UiFactory uiFactory;
		if(whichOs.equalsIgnoreCase("Mac"))
		{
			uiFactory= new MacUiFactory();
		}
		else if(whichOs.equalsIgnoreCase("Windows"))
		{
			uiFactory= new WindowsUiFactory();
		}
		else {
			throw new IllegalAccessException("Wrong windows bro!!");
		}

		Button button = uiFactory.createButton();
		button.paint();

		Checkbox checkbox = uiFactory.createCheckbox();
		checkbox.render();




		//Prototype desgin pattern

		System.out.println("Prototype Design Pattern !!!!");
		ConiferousTree pine = new ConiferousTree();
		pine.setHeight(10.5);
		pine.setNeedleLength(5);
		pine.setProducesCones(true);
		pine.display();

		Tree cloneConferious = pine.clone();
		cloneConferious.display();

		DeciduousTree deciduousTree= new DeciduousTree();
		deciduousTree.setLeafTree("Maple");
		deciduousTree.setHeight(8.9);
		deciduousTree.setAutumColour("Red-Orange");
		deciduousTree.display();
		Tree mapleTree = deciduousTree.clone();
		mapleTree.display();




		System.out.println("Builder Design Pattern !!!!");
		Pizza mypizza = new Pizza.Builder("Medium")
				.addCheese(true)
				.addPeproni(false)
				.addMushroom(true)
				.build();

		System.out.println("Here is your pizzaaa !!!" +mypizza);


		System.out.println(mypizza);

		Pizza mypizza2 = new Pizza.Builder("Large")
				.addCheese(true)
				.build();
		System.out.println("Here is your pizzaaa !!!" +mypizza2);


		System.out.println(mypizza2);



		//Adapter pattern

		System.out.println("Adapter pattern ");
		AudioPlayer audioPlayer= new AudioPlayer();
		audioPlayer.play("mp3", "summer_vibes.mp3");
		audioPlayer.play("mp4", "vacation_video.mp4");
		audioPlayer.play("vlc", "documentary.vlc");


		UsbCCharger usbCCharger=new UsbCCharger();
		ChargerAdapter chargerAdapter= new ChargerAdapter(usbCCharger);
		Laptop laptop= new Laptop();
		laptop.chargeLaptop(chargerAdapter);

		//Bridge pattern

		System.out.println("Bridge pattern ");
		DancingRobot dancingRobot= new DancingRobot();
		DanceRemote danceRemote= new DanceRemote(dancingRobot);
		danceRemote.pressDanceButton();

		DancingDog dancingDog= new DancingDog();

		DanceRemote danceRemoteDog= new DanceRemote(dancingDog);
		danceRemoteDog.pressDanceButton();

		FlipRobot flipRobot=new FlipRobot();
		FlipRemote flipRemote= new FlipRemote(flipRobot);
		flipRemote.flip();

		//Decorator Design Pattern
		System.out.println("Decorator design pattern");
		BasePizza pizza = new ExtraChicken(new ExtraCheese(new ChickenSupreme()));
		System.out.println("Macy , here is your bill to pay : "+ pizza.cost());


		IceCream iceCream = new ChocolateSyrup(new VanillaCone());
		System.out.println(iceCream.getDescription());
		System.out.println(iceCream.getCost());


		//Facade design pattern
		System.out.println("Facade Design Pattern.......");
		EmailService emailService = new EmailService();
		RoomService roomService = new RoomService();
		PaymentService paymentService = new PaymentService();

		HotelFacade hotelFacade = new HotelFacade(emailService,paymentService,roomService);
		hotelFacade.bookRoom();


		//Proxy Desing Pattern
		System.out.println("Proxy Design Pattern .....");
		ProxyInternetAccess proxyInternetAccess= new ProxyInternetAccess("ADMIN");
		proxyInternetAccess.grantAccess();
		ProxyInternetAccess proxyInternetAccess1= new ProxyInternetAccess("Manager");
		proxyInternetAccess1.grantAccess();
		ProxyInternetAccess proxyInternetAccess2= new ProxyInternetAccess("Devloper");
		proxyInternetAccess2.grantAccess();
	}





}
