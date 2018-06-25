package com.example.abhijeetsingh.shanaya;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class Sign_up extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private android.widget.ImageView mdate;
    private Button SignUp2;
    private EditText fname;
    private EditText lname;
    private EditText phno;
    private EditText email;
    private EditText password;
    private EditText confpass;
    private EditText DOB;
    public String mName;
    public String mLastName;
    public String mEmail;
    public String mPassword="";
    public String mConfPass="";
    public String mobnum;
    public String dob;
    Spinner spin;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    String Roles[]={"Employee","HR","Trainee","Vendor","Management"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getWindow().setBackgroundDrawableResource(R.drawable.background_blur);
        SignUp2=(Button)findViewById(R.id.SignUp2);
        fname=(EditText)findViewById(R.id.nameID);
        lname=(EditText)findViewById(R.id.lastnameID);
        email=(EditText)findViewById(R.id.EmailID);
        password=(EditText)findViewById(R.id.passwordID);
        confpass=(EditText)findViewById(R.id.confirmID);
        phno=(EditText)findViewById(R.id.mobnumID);
        DOB=(EditText)findViewById(R.id.dobID);
        mdate=(ImageView)findViewById(R.id.calendarID);

        mdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cal= Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(Sign_up.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                DOB.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, year, month, day);
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                datePickerDialog.show();


            }
        });


        spin = (Spinner) findViewById(R.id.spinner1);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the designation name list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Roles);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);


        SignUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mName=fname.getText().toString();
                mLastName=lname.getText().toString();
                mEmail=email.getText().toString();
                mPassword=password.getText().toString();
                mConfPass=confpass.getText().toString();
                dob=DOB.getText().toString();
                mobnum=phno.getText().toString();
//                if(mName.isEmpty())
//                {
//                    Toast.makeText(getApplicationContext(),"Enter First Name", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(mLastName.equals(""))
//                {
//                    Toast.makeText(getApplicationContext(),"Enter Last Name", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(mEmail.isEmpty() || !(isValid(mEmail)))
//                {
//                    Toast.makeText(getApplicationContext(),"Enter a valid email address", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(mPassword.isEmpty())
//                {
//                    Toast.makeText(getApplicationContext(),"Enter Password", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(mConfPass.equals(mPassword)==false)
//                {
//                    Toast.makeText(getApplicationContext(),"Passwords don't match", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(mobnum.isEmpty() || mobnum.length()!=10)
//                {
//                    Toast.makeText(getApplicationContext(),"Enter valid mobile number", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                if(dob.isEmpty())
//                {
//                    Toast.makeText(getApplicationContext(),"Enter valid DOB", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                else
//                {
//                    int count=0,f=0; char c=0;
//                    for(int i=0;i<dob.length();i++)
//                    {
//                        if(count>2)
//                        {
//                            f=1;
//                            break;
//                        }
//                        c=dob.charAt(i);
//                        if(c=='.' || c=='/' || c=='-')
//                            count++;
//                        else if(Character.isDigit(c)==false)
//                            f=1;
//                    }
//                    if(f==1 || dob.length()>10)
//                    {
//                        Toast.makeText(getApplicationContext(),"Enter DOB in given format", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                }


                String selected_role=spin.getSelectedItem().toString();
                if(selected_role.equals("Trainee"))
                {
                    Intent i=new Intent(Sign_up.this,Trainee.class);
                    startActivity(i);
                    finish();
                }
                else if (selected_role.equals("Employee"))
                {
                    Intent i1=new Intent(Sign_up.this,EmployeeType.class);
                    startActivity(i1);
                    finish();
                }
//
                else if(selected_role.equals("HR"))
                {
                    Intent i2=new Intent(Sign_up.this,HR.class);
                    startActivity(i2);
                }
                else if(selected_role.equals("Vendor"))
                {
                    Intent i3=new Intent(Sign_up.this,Vendor.class);
                    startActivity(i3);
                }
//                else if(selected_role.equals("Management"))
//                {
//                    Intent i4=new Intent(Sign_up.this,Management.class);
//                    startActivity(i4);
//                }

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
//        Toast.makeText(getApplicationContext(), designations[position], Toast.LENGTH_LONG).show();
    }
    //Performing action onItemSelected and onNothing selected

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        Toast.makeText(getApplicationContext(), "Select designation", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    public boolean isValid(String email)
    {
        String s=email;
        if(!(email.contains("@"))&&!(email.contains(".")))
            return false;

        if(s.isEmpty())
            return false;
        int x=0,y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='@')
                x=i;
            if(s.charAt(i)=='.')
                y=i;
        }
        if(x>y)
            return false;
        else
            return true;
    }
}
