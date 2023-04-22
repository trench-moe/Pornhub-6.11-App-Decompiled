package x2;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.app.pornhub.data.model.update.PronstoreEvent;
import com.app.pornhub.domain.error.UpdateAttemptsThresholdExceededException;
import io.reactivex.functions.Consumer;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17733c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j1 f17734f;

    public /* synthetic */ g1(j1 j1Var, int i10) {
        this.f17733c = i10;
        this.f17734f = j1Var;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17733c) {
            case 0:
                j1 this$0 = this.f17734f;
                File it = (File) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f17762h = 0;
                kf.a.f12078a.a(Intrinsics.stringPlus("File downloaded to ", it.getAbsolutePath()), new Object[0]);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (Build.VERSION.SDK_INT >= 24) {
                    Uri b10 = FileProvider.a(this$0.f17756a, "com.app.pornhub.fileprovider").b(it);
                    Intrinsics.checkNotNullExpressionValue(b10, "getUriForFile(\n         … updateFile\n            )");
                    Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
                    intent.setData(b10);
                    intent.setFlags(268435457);
                    this$0.f17756a.startActivity(intent);
                } else {
                    Uri fromFile = Uri.fromFile(it);
                    Intent intent2 = new Intent("android.intent.action.VIEW", fromFile);
                    intent2.addFlags(268435456);
                    intent2.setDataAndType(fromFile, "application/vnd.android.package-archive");
                    this$0.f17756a.startActivity(intent2);
                }
                this$0.d(new PronstoreEvent(this$0.f17763i, 2, 0, this$0.f17759e, 4, null));
                return;
            default:
                j1 this$02 = this.f17734f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                int i10 = this$02.f17762h;
                if (5 == i10) {
                    this$02.f17762h = 0;
                    throw new UpdateAttemptsThresholdExceededException("Update failed threshold reached");
                }
                this$02.f17762h = i10 + 1;
                kf.a.f12078a.d(it2, "Error fetching download metadata", new Object[0]);
                y2.a aVar = this$02.d;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar.a(it2);
        }
    }
}
