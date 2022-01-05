package builder;

import builder.SmartHome.SmartHomeBuilder;

public class Application {

	public static void main(String[] args) {

		SmartHome smartHomeSystem = ((SmartHomeBuilder) new SmartHome.SmartHomeBuilder().withName("HaSmartHomeSystem")
				.withSerialNumber(3627).withAddressName("Adrs").withAddressNumber("24").inCity("Ma").inCountry("Ma")
				.withPostalCode("800").withDoor1PortNum(342)).build();

		System.out.println(smartHomeSystem.toString());
	}
}
