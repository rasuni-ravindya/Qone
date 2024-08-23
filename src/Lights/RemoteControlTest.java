package Lights;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(2);

        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();

        // Kitchen Room Commands
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        LightDimCommand kitchenLightDim = new LightDimCommand(kitchenLight, 50);


        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim = new LightDimCommand(livingRoomLight, 30);


        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);


        remoteControl.onButtonWasPressed(0);  // turn ON kitchen light
        remoteControl.offButtonWasPressed(0); // turn OFF kitchen light
        remoteControl.onButtonWasPressed(0);


        remoteControl.onButtonWasPressed(1);  // turn ON living room light
        remoteControl.offButtonWasPressed(1); // turn OFF living room light
        remoteControl.onButtonWasPressed(1);


        kitchenLightDim.execute();            // dim kitchen light to 50%
        kitchenLightDim.undo();               // undo dim


        livingRoomLightDim.execute();         // dim living room light to 30%
        livingRoomLightDim.undo();            // undo dim
    }
}
