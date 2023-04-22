package k2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import b3.o;
import com.airbnb.lottie.network.FileExtension;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.exoplayer2.source.q;
import ea.e;
import ea.g;
import io.reactivex.Observable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import t9.j;
import v8.c0;
import x2.a0;
import x2.k0;

/* loaded from: classes.dex */
public class c implements q, ea.c, x8.a, e, ea.d, ea.b, tb.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11774c;

    /* renamed from: f  reason: collision with root package name */
    public Object f11775f;

    public c(int i10) {
        this.f11774c = i10;
        if (i10 != 9) {
            return;
        }
        this.f11775f = new CountDownLatch(1);
    }

    public c(b3.a adsAndPromosRepository) {
        this.f11774c = 1;
        Intrinsics.checkNotNullParameter(adsAndPromosRepository, "adsAndPromosRepository");
        this.f11775f = adsAndPromosRepository;
    }

    public c(b3.d commentsRepository) {
        this.f11774c = 2;
        Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
        this.f11775f = commentsRepository;
    }

    public c(b3.e currentUserRepository) {
        this.f11774c = 3;
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f11775f = currentUserRepository;
    }

    public c(o videosRepository) {
        this.f11774c = 4;
        Intrinsics.checkNotNullParameter(videosRepository, "videosRepository");
        this.f11775f = videosRepository;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.f11774c = i10;
        this.f11775f = obj;
    }

    public static String t(String str, FileExtension fileExtension, boolean z10) {
        String str2;
        StringBuilder m10 = a1.a.m("lottie_cache_");
        m10.append(str.replaceAll("\\W+", BuildConfig.FLAVOR));
        if (z10) {
            Objects.requireNonNull(fileExtension);
            str2 = ".temp" + fileExtension.extension;
        } else {
            str2 = fileExtension.extension;
        }
        m10.append(str2);
        return m10.toString();
    }

    @Override // com.google.android.exoplayer2.source.q
    public long a() {
        long j10 = Long.MAX_VALUE;
        for (q qVar : (q[]) this.f11775f) {
            long a10 = qVar.a();
            if (a10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, a10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.q
    public boolean b(long j10) {
        q[] qVarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long a10 = a();
            if (a10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (q qVar : (q[]) this.f11775f) {
                long a11 = qVar.a();
                boolean z12 = a11 != Long.MIN_VALUE && a11 <= j10;
                if (a11 == a10 || z12) {
                    z10 |= qVar.b(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // com.google.android.exoplayer2.source.q
    public boolean c() {
        for (q qVar : (q[]) this.f11775f) {
            if (qVar.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.q
    public long d() {
        long j10 = Long.MAX_VALUE;
        for (q qVar : (q[]) this.f11775f) {
            long d = qVar.d();
            if (d != Long.MIN_VALUE) {
                j10 = Math.min(j10, d);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.q
    public void e(long j10) {
        for (q qVar : (q[]) this.f11775f) {
            qVar.e(j10);
        }
    }

    @Override // tb.a
    public void f(String str, Bundle bundle) {
        ((ob.a) this.f11775f).b("clx", str, bundle);
    }

    @Override // ea.c
    public void g(g gVar) {
        v8.d.p(((c0) this.f11775f).f16078a, "joinApplication", gVar);
    }

    @Override // x8.a
    public void i(Bitmap bitmap) {
        if (bitmap != null) {
            View view = ((j) this.f11775f).f15254e;
            if (view != null) {
                view.setVisibility(4);
            }
            ((j) this.f11775f).f15252b.setVisibility(0);
            ((j) this.f11775f).f15252b.setImageBitmap(bitmap);
        }
    }

    @Override // ea.b
    public void l() {
        ((CountDownLatch) this.f11775f).countDown();
    }

    @Override // ea.e
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f11775f).countDown();
    }

    @Override // ea.d
    public void q(Exception exc) {
        ((CountDownLatch) this.f11775f).countDown();
    }

    public Observable r() {
        switch (this.f11774c) {
            case 1:
                Observable startWith = ((b3.a) this.f11775f).a().toObservable().map(a0.n).onErrorReturn(k0.f17767j).startWith((Observable) UseCaseResult.a.f4910a);
                Intrinsics.checkNotNullExpressionValue(startWith, "adsAndPromosRepository.g…th(UseCaseResult.Loading)");
                return startWith;
            default:
                return ((b3.d) this.f11775f).d();
        }
    }

    public File u() {
        b2.c cVar = (b2.c) ((b) this.f11775f);
        Objects.requireNonNull(cVar);
        File file = new File(cVar.f3443a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public File v(String str, InputStream inputStream, FileExtension fileExtension) {
        File file = new File(u(), t(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
