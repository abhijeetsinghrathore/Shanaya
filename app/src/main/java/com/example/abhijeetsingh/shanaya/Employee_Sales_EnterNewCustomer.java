package com.example.abhijeetsingh.shanaya;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee_Sales_EnterNewCustomer extends AppCompatActivity {

    private static final int CAMERA_REQUEST = 1888;
    private static final int MY_CAMERA_PERMISSION_CODE = 100;
    private static final int SELECT_IMAGE = 1;
    String mCurrentPhotoPath;
    Uri photouri;

    Button saveCustomer, addimage;
    ImageView customerImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee__sales__enter_new_customer);


        saveCustomer = (Button) findViewById(R.id.saveCustomerID);
        addimage = (Button) findViewById(R.id.addimagebutton);

        saveCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), Employee_Sales.class);
                startActivity(i);
            }
        });

        addimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder addimagedialogbuilder = new AlertDialog.Builder(new ContextThemeWrapper(Employee_Sales_EnterNewCustomer.this, R.style.myDialog));
                View dialogview = getLayoutInflater().inflate(R.layout.custom_dailog_addimage, null);
                TextView gallery = (TextView) dialogview.findViewById(R.id.importfromgalleryID);
                TextView camera = (TextView) dialogview.findViewById(R.id.opencameraID);
                Button closedialog = (Button) dialogview.findViewById(R.id.closedialogbuttonID);
                customerImage = (ImageView) findViewById(R.id.customerimageID);

                addimagedialogbuilder.setView(dialogview);
                final AlertDialog addimagedialog = addimagedialogbuilder.create();
                addimagedialog.setTitle("Select Action");
                addimagedialog.show();
                closedialog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addimagedialog.dismiss();

                    }
                });

                gallery.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent();
                        intent.setType("image/*");
                        intent.setAction(Intent.ACTION_GET_CONTENT);//
                        startActivityForResult(Intent.createChooser(intent, "Select Picture"), SELECT_IMAGE);

                    }
                });


                camera.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {


//                        if (checkSelfPermission(Manifest.permission.CAMERA)
//                                != PackageManager.PERMISSION_GRANTED) {
//                            requestPermissions(new String[]{Manifest.permission.CAMERA},
//                                    MY_CAMERA_PERMISSION_CODE);
//                        } else {
                        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                        if (cameraIntent.resolveActivity(getPackageManager()) != null) {
                            File photofile = null;
                            try {
                                photofile = createImageFile();

                            } catch (IOException ex) {

                            }


                            if (photofile != null) {
                                photouri = FileProvider.getUriForFile(getBaseContext(), "com.example.abhijeetsingh.shanaya", photofile);
                                cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, photouri);
                                startActivityForResult(cameraIntent, CAMERA_REQUEST);


                            }
                        }


//                        }
//
                    }


                });


            }
        });
    }


//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == Activity.RESULT_OK) {
//            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                Toast.makeText(this, "camera permission granted", Toast.LENGTH_LONG).show();
//                Intent cameraIntent = new
//                        Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
//                startActivityForResult(cameraIntent, CAMERA_REQUEST);
//            } else {
//                Toast.makeText(this, "camera permission denied", Toast.LENGTH_LONG).show();
//            }
//
//        }
//    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
//            Bitmap photo = (Bitmap) data.getExtras().get("data");
//            customerImage.setImageBitmap(photo);
            Uri selectedImage = photouri;
            if (selectedImage != null) {
                customerImage.setImageURI(selectedImage);
            }

        } else if (requestCode == SELECT_IMAGE) {
            if (resultCode == Activity.RESULT_OK) {
                Uri selectedImage = data.getData();
                if (selectedImage != null) {
                    customerImage.setImageURI(selectedImage);
                }
            } else if (resultCode == Activity.RESULT_CANCELED) {
                Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();
            }
        }
    }


    private File createImageFile() throws IOException {
        // Create an image file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String imageFileName = "JPEG_" + timeStamp + "_";
        File storageDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File image = File.createTempFile(
                imageFileName,  /* prefix */
                ".jpg",         /* suffix */
                storageDir      /* directory */
        );

        // Save a file: path for use with ACTION_VIEW intents
        mCurrentPhotoPath = image.getAbsolutePath();
        return image;
    }

}

