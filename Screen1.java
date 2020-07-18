package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.File;
class Screen1 extends Form implements HandlesEventDispatching {
  private Label Label4;
  private PasswordTextBox PasswordTextBox3;
  private Button Button3;
  private Label Label3;
  private HorizontalArrangement HorizontalArrangement1;
  private Button login;
  private PasswordTextBox PasswordTextBox1;
  private Label Label2;
  private Label Label1;
  private VerticalArrangement VerticalArrangement1;
  private PasswordTextBox PasswordTextBox2;
  private Button Button1;
  private Button Button2;
  private TinyDB TinyDB1;
  private File File1;
  protected void $define() {
    this.AppName("cyber_security");
    this.Title("Screen1");
    Label4 = new Label(this);
    Label4.Text("Enter password (if set)");
    PasswordTextBox3 = new PasswordTextBox(this);
    Button3 = new Button(this);
    Button3.Text("Login Again");
    Label3 = new Label(this);
    Label3.Text("Enter 1234 for the initial setup.");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    login = new Button(HorizontalArrangement1);
    login.Text("Login");
    PasswordTextBox1 = new PasswordTextBox(HorizontalArrangement1);
    Label2 = new Label(this);
    Label2.Text("Set Custom Password");
    Label2.Visible(false);
    Label1 = new Label(this);
    VerticalArrangement1 = new VerticalArrangement(this);
    VerticalArrangement1.Visible(false);
    PasswordTextBox2 = new PasswordTextBox(VerticalArrangement1);
    Button1 = new Button(VerticalArrangement1);
    Button1.Text("Set New Password");
    Button2 = new Button(this);
    Button2.Text("To Folder");
    Button2.Visible(false);
    TinyDB1 = new TinyDB(this);
    File1 = new File(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}