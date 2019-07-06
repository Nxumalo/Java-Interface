package Interface;
import java.applet.*;
import java.awt.*;

public class EX05E extends Applet{
	
	CheckboxGroup genderGroup = new CheckboxGroup();
	Checkbox runCheckbox = new Checkbox("Run");
	Checkbox bikeCheckbox = new Checkbox("Bike");
	Checkbox swimCheckbox = new Checkbox("Swim");
	Checkbox rowCheckbox = new Checkbox("Row");
	Checkbox liftCheckbox = new Checkbox("Weight Lift");
	TextArea results = new TextArea(10,25);
	
	public void init() {
		resize(320,240);
		
		add(new Label("Gender: "));
		add(new Checkbox("Male", genderGroup,false));
		add(new Checkbox("Female",genderGroup,true));
		
		add(new Label("In your spare time, what sports do you participate in?"));
		add(runCheckbox);
		add(bikeCheckbox);
		add(swimCheckbox);
		add(rowCheckbox);
		add(liftCheckbox);
		
		add(new Button("Save"));
		add(results);
		
	}
	
	public boolean action(Event evt, Object obj) {
		boolean result = false;
		
		if("Save".equals(obj)) {
			results.setText("");
			
			Checkbox current = genderGroup.getCurrent();
			results.appendText(current.getLabel() + "\r\n");
			
			if(swimCheckbox.getState() == true)
				results.appendText("Swim\r\n");
			if(bikeCheckbox.getState() == true)
				results.appendText("Bike\r\n");
			if(runCheckbox.getState() == true)
				results.appendText("Run\r\n");
			if(rowCheckbox.getState() == true)
				results.appendText("Row\r\n");
			if(liftCheckbox.getState() == true)
				results.appendText("Weight Lift\r\n");
			result = true;
			
		}
		return result;
	}

}
