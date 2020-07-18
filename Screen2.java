package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.File;
class Screen2 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement HorizontalArrangement1;
  private Label Label1;
  private TextBox TextBox1;
  private Button Button1;
  private Label Label2;
  private Button Button2;
  private Button Button3;
  private File File1;
  protected void $define() {
    this.AppName("cyber_security");
    this.Title("Screen2");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    Label1 = new Label(HorizontalArrangement1);
    Label1.Text("enter text");
    TextBox1 = new TextBox(HorizontalArrangement1);
    TextBox1.Hint("Your Secured Info");
    Button1 = new Button(this);
    Button1.Text("save");
    Label2 = new Label(this);
    Button2 = new Button(this);
    Button2.Text("retrive data");
    Button3 = new Button(this);
    Button3.Text("log out");
    File1 = new File(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}