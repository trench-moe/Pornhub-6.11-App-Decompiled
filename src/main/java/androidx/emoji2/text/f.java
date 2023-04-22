package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class f extends d.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.h f1960a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1961b;

    public f(EmojiCompatInitializer.b bVar, d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1960a = hVar;
        this.f1961b = threadPoolExecutor;
    }

    @Override // androidx.emoji2.text.d.h
    public void a(Throwable th) {
        try {
            this.f1960a.a(th);
            this.f1961b.shutdown();
        } catch (Throwable th2) {
            this.f1961b.shutdown();
            throw th2;
        }
    }

    @Override // androidx.emoji2.text.d.h
    public void b(m mVar) {
        try {
            this.f1960a.b(mVar);
            this.f1961b.shutdown();
        } catch (Throwable th) {
            this.f1961b.shutdown();
            throw th;
        }
    }
}
