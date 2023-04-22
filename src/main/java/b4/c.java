package b4;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class c extends b4.a {
    public static final /* synthetic */ int A = 0;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f3553c;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayout f3554f;

    /* renamed from: j  reason: collision with root package name */
    public RadioButton f3555j;

    /* renamed from: m  reason: collision with root package name */
    public RadioButton f3556m;
    public Button n;

    /* renamed from: t  reason: collision with root package name */
    public Button f3557t;

    /* renamed from: u  reason: collision with root package name */
    public Context f3558u;

    /* renamed from: w  reason: collision with root package name */
    public LayoutInflater f3559w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public a f3560z;

    /* loaded from: classes.dex */
    public interface a {
    }

    public c(Context context) {
        super(context);
        this.f3559w = LayoutInflater.from(context);
        this.f3558u = context;
    }

    @Override // b4.a, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_base_linear);
        ((LinearLayout) findViewById(R.id.dialog_llyContent)).addView(this.f3559w.inflate(R.layout.include_dialog_discreeticon, (ViewGroup) null, false));
        this.f3553c = (LinearLayout) findViewById(R.id.dialog_discreeticon_llyNormal);
        this.f3554f = (LinearLayout) findViewById(R.id.dialog_discreeticon_llyDiscreet);
        this.f3555j = (RadioButton) findViewById(R.id.dialog_discreeticon_radioNormal);
        this.f3556m = (RadioButton) findViewById(R.id.dialog_discreeticon_radioDiscreet);
        this.n = (Button) findViewById(R.id.dialog_btnOk);
        this.f3557t = (Button) findViewById(R.id.dialog_btnCancel);
        this.f3553c.setOnClickListener(new u3.b(this, 2));
        this.f3554f.setOnClickListener(new u3.c(this, 1));
        this.f3557t.setOnClickListener(new u3.a(this, 2));
        this.n.setOnClickListener(new b(this, 0));
        boolean z10 = this.f3558u.getPackageManager().getComponentEnabledSetting(new ComponentName("com.app.pornhub", "com.app.pornhub.alias.discreet")) == 1;
        this.y = z10;
        this.f3555j.setChecked(!z10);
        this.f3556m.setChecked(this.y);
        this.n.setEnabled(false);
    }
}
