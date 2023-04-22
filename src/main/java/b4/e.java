package b4;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f3565c = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // b4.a, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_base_linear);
        View inflate = getLayoutInflater().inflate(R.layout.include_dialog_favorite, (ViewGroup) null, false);
        ((LinearLayout) findViewById(R.id.dialog_llyContent)).addView(inflate);
        Button btnCancel = (Button) findViewById(R.id.dialog_btnCancel);
        Intrinsics.checkNotNullExpressionValue(btnCancel, "btnCancel");
        btnCancel.setVisibility(8);
        Button button = (Button) findViewById(R.id.dialog_btnOk);
        button.setText(getContext().getString(R.string.dialog_flag_gif_action_btn_text));
        button.setOnClickListener(new u3.b(this, 3));
        ((TextView) inflate.findViewById(R.id.dialogTitle)).setText(R.string.dialog_flag_gif_login_required);
    }
}
