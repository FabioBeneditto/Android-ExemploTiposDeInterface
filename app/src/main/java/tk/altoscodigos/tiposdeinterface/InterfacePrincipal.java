package tk.altoscodigos.tiposdeinterface;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class InterfacePrincipal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_principal);
    }

    public void executaLogin( View v){
        EditText nome = (EditText) findViewById(R.id.fNome);
        EditText senha = (EditText) findViewById(R.id.fSenha);

        if(nome.getText().toString().equals("malu")){
            if(senha.getText().toString().equals("111")){
                Toast.makeText(this, R.string.msg_saudacao, Toast.LENGTH_LONG).show();
                return;
            }
        }

/*        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Atenção");
        builder.setMessage("Usuário ou Senha Inválida");
        builder.setPositiveButton("Ok", null);
        builder.show();*/

        new AlertDialog.Builder(this)
            .setTitle("Atenção")
            .setMessage("Usuário ou Senha Inválida")
            .setPositiveButton("Ok", null)
            .show();

        Toast.makeText(this, R.string.msg_erro, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_interface_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
