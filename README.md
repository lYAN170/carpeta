## Aplicacion para Ventas Online 

---

## Registro de Usuario


<div style="display: flex; justify-content: space-between;">
  <img src= "https://github.com/lYAN170/carpeta/assets/169726463/69172d31-741e-481e-9256-f20aca1dccd2" alt="Imagen 1" style="width: 38%;"/>
  <img src="https://github.com/lYAN170/carpeta/assets/169726463/1a46d516-d2d6-4986-bf52-07fd6deed30e" alt="Imagen 2" style="width: 38%;"/>
</div>

### Loyout

    <?xml version="1.0" encoding="utf-8"?>
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/main"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:background="@drawable/punotoqen">

      </RelativeLayout>

 ![image](https://github.com/lYAN170/carpeta/assets/169726463/0b59fe15-f16b-417c-a6f5-3e254b21ae7d)

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".HomeActivity2"
    android:background="@drawable/pc">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="BIENVENIDOS A TOQEN VENTAS ONLINE"
        android:textAlignment="center"
        android:layout_marginTop="20dp"
        android:textSize="20dp"
        android:textColor="@color/white_700"
        />

    <Button

        android:id="@+id/botonusuario"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="20dp"
        android:padding="10dp"
        android:text="USUARIO"
        android:background="@drawable/botones1"
        android:textColor="@color/white_700"
        android:layout_above="@id/botonadministrador"/>

    <Button
        android:id="@+id/botonadministrador"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:background="@drawable/botones1"
        android:text="ADMINISTRADOR"
        android:textColor="@color/white_700"
        android:layout_alignParentBottom="true"
        android:layout_marginBottom="100dp"
        android:layout_marginRight="20dp"
        android:layout_marginLeft="20dp"
        />


</RelativeLayout>

![image](https://github.com/lYAN170/carpeta/assets/169726463/1b429fa0-e1ca-41f1-ae6e-8fbfcb311d90)


<?xml version="1.0" encoding="UTF-8" ?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".loginActivity2">

    <TextView
        android:id="@+id/text1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="INICIAR SESION"
        android:textAlignment="center"
        android:layout_marginTop="10dp"
        android:textStyle="bold"
        android:textSize="20dp"
        android:textColor="@color/red_500"
        />
    <com.google.android.material.circularreveal.cardview.CircularRevealCardView
        android:id="@+id/image1"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:layout_centerHorizontal="true"
        android:layout_below="@+id/text1"
        android:layout_marginTop="5dp"
        android:src="@drawable/pc"/>



    <EditText
        android:id="@+id/numero"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/image1"
        android:layout_margin="20dp"
        android:hint="Ingrese Numero"
        android:background="@drawable/textos"
        android:padding="10dp"
        android:inputType="number"
        android:textStyle="bold"
        android:textSize="18dp"

        />

    <EditText
        android:id="@+id/codigo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/image1"
        android:layout_margin="20dp"
        android:hint="Ingrese Codigo de verificacion"
        android:background="@drawable/textos"
        android:padding="10dp"
        android:inputType="number"
        android:textStyle="bold"
        android:textSize="18dp"
        android:visibility="gone"
        />
    <Button
        android:id="@+id/Fecebook"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/numero"
        android:text="Enviar Codigo"
        android:layout_margin="22dp"
        android:background="@drawable/botones1"
        android:textSize="16dp"

        />

    <Button
        android:id="@+id/Enviarcodigo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/codigo"
        android:text=" "
        android:layout_margin="22dp"
        android:background="@drawable/botones1"
        android:textSize="16dp"
        android:visibility="gone"
        />

    <Button
        android:id="@+id/Google"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="GOOGLE"
        android:layout_margin="22dp"
        android:background="@drawable/botones1"
        android:textSize="16dp"
        android:layout_alignParentBottom="true"

        />
</RelativeLayout>


![image](https://github.com/lYAN170/carpeta/assets/169726463/abfe0867-3df4-49d5-b184-c538bb1eba96)


