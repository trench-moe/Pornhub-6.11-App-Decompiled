package b4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class d extends b4.a {
    public static final /* synthetic */ int n = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3561c;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutInflater f3562f;

    /* renamed from: j  reason: collision with root package name */
    public a f3563j;

    /* renamed from: m  reason: collision with root package name */
    public final String f3564m;

    /* loaded from: classes.dex */
    public interface a {
        void c();
    }

    public d(Context context, String str) {
        super(context);
        this.f3562f = LayoutInflater.from(context);
        this.f3561c = context;
        this.f3564m = str;
    }

    @Override // b4.a, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_base_linear);
        View inflate = this.f3562f.inflate(R.layout.include_dialog_favorite, (ViewGroup) null, false);
        ((LinearLayout) findViewById(R.id.dialog_llyContent)).addView(inflate);
        ((Button) findViewById(R.id.dialog_btnCancel)).setOnClickListener(new x3.a(this, 2));
        Button button = (Button) findViewById(R.id.dialog_btnOk);
        button.setText(this.f3561c.getString(R.string.login));
        button.setOnClickListener(new x3.b(this, 2));
        ((TextView) inflate.findViewById(R.id.dialogTitle)).setText(this.f3564m);
    }
}
