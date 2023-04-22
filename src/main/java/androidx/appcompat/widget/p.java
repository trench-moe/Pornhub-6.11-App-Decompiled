package androidx.appcompat.widget;

import android.util.Log;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* loaded from: classes.dex */
public class p {

    /* renamed from: c  reason: collision with root package name */
    public static p f1051c;

    /* renamed from: a  reason: collision with root package name */
    public Object f1052a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1053b;

    public p(int i10) {
        if (i10 != 4) {
            this.f1052a = new HashSet();
            this.f1053b = new HashSet();
        }
    }

    public p(TextView textView) {
        this.f1052a = textView;
    }

    public p(g9.a aVar) {
        this.f1052a = aVar == null ? null : aVar.f9883f;
    }

    public /* synthetic */ p(String str, ac.c cVar) {
        this.f1052a = str;
        this.f1053b = cVar;
    }

    public static p b() {
        if (f1051c == null) {
            f1051c = new p(1);
        }
        return f1051c;
    }

    public boolean a() {
        try {
            return c().createNewFile();
        } catch (IOException e10) {
            StringBuilder m10 = a1.a.m("Error creating marker: ");
            m10.append((String) this.f1052a);
            Log.e("FirebaseCrashlytics", m10.toString(), e10);
            return false;
        }
    }

    public File c() {
        return ((ac.c) this.f1053b).a((String) this.f1052a);
    }

    public TextClassifier d() {
        Object obj = this.f1053b;
        if (((TextClassifier) obj) == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) ((TextView) this.f1052a).getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return (TextClassifier) obj;
    }
}
