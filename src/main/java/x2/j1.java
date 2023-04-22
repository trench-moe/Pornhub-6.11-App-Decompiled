package x2;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.app.pornhub.data.model.update.PronstoreEvent;
import com.app.pornhub.domain.model.update.ProgressEvent;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j1 implements b3.m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17756a;

    /* renamed from: b  reason: collision with root package name */
    public final w2.l f17757b;

    /* renamed from: c  reason: collision with root package name */
    public final w2.n f17758c;
    public final y2.a d;

    /* renamed from: e  reason: collision with root package name */
    public final String f17759e;

    /* renamed from: f  reason: collision with root package name */
    public final CompositeDisposable f17760f;

    /* renamed from: g  reason: collision with root package name */
    public PublishSubject<ProgressEvent> f17761g;

    /* renamed from: h  reason: collision with root package name */
    public int f17762h;

    /* renamed from: i  reason: collision with root package name */
    public long f17763i;

    public j1(Context context, w2.l pronStoreService, w2.n updateDownloadService, y2.a exceptionMapper, String androidId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pronStoreService, "pronStoreService");
        Intrinsics.checkNotNullParameter(updateDownloadService, "updateDownloadService");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        this.f17756a = context;
        this.f17757b = pronStoreService;
        this.f17758c = updateDownloadService;
        this.d = exceptionMapper;
        this.f17759e = androidId;
        this.f17760f = new CompositeDisposable();
        PublishSubject<ProgressEvent> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create<ProgressEvent>()");
        this.f17761g = create;
    }

    @Override // b3.m
    public Single<Boolean> a() {
        d(new PronstoreEvent(0L, 0, 0, this.f17759e, 5, null));
        Single<Boolean> map = m9.a.i(this.f17757b.b()).doOnError(new g1(this, 1)).map(i1.f17744f);
        Intrinsics.checkNotNullExpressionValue(map, "pronStoreService.getCurr…ERSION_CODE\n            }");
        return map;
    }

    @Override // b3.m
    public Observable<ProgressEvent> b() {
        File externalStorageDirectory;
        this.f17760f.clear();
        PublishSubject<ProgressEvent> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.f17761g = create;
        d(new PronstoreEvent(this.f17763i, 1, 0, this.f17759e, 4, null));
        Context context = this.f17756a;
        if (Build.VERSION.SDK_INT >= 24) {
            externalStorageDirectory = context.getFilesDir();
            if (!c(externalStorageDirectory)) {
                externalStorageDirectory = Environment.getExternalStorageDirectory();
                if (!c(externalStorageDirectory)) {
                    externalStorageDirectory = context.getExternalCacheDir();
                    if (!c(externalStorageDirectory)) {
                        externalStorageDirectory = context.getCacheDir();
                    }
                }
            }
        } else {
            externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (!c(externalStorageDirectory)) {
                externalStorageDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                if (!c(externalStorageDirectory)) {
                    externalStorageDirectory = context.getExternalCacheDir();
                }
            }
        }
        File file = new File(externalStorageDirectory, "update.apk");
        if (file.exists()) {
            file.delete();
        }
        Observable<R> flatMap = this.f17758c.a().flatMap(new i(file, 5));
        Intrinsics.checkNotNullExpressionValue(flatMap, "updateDownloadService.do…          }\n            }");
        Intrinsics.checkNotNullParameter(flatMap, "<this>");
        Scheduler io2 = Schedulers.io();
        Intrinsics.checkNotNullExpressionValue(io2, "io()");
        Disposable subscribe = flatMap.subscribeOn(io2).observeOn(AndroidSchedulers.mainThread()).subscribe(new g1(this, 0), new c(this, 5), new Action() { // from class: x2.f1
            @Override // io.reactivex.functions.Action
            public final void run() {
                j1 this$0 = j1.this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f17761g.onComplete();
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "updateDownloadService.do…Complete()\n            })");
        DisposableKt.addTo(subscribe, this.f17760f);
        return this.f17761g;
    }

    public final boolean c(File file) {
        return file != null && file.exists() && file.isDirectory() && file.canWrite();
    }

    public final void d(PronstoreEvent pronstoreEvent) {
        kf.a.f12078a.a("Sending pronstore event id %s status %s", Long.valueOf(pronstoreEvent.getId()), Integer.valueOf(pronstoreEvent.getStatus()));
        Disposable subscribe = m9.a.i(this.f17757b.a(pronstoreEvent)).subscribe(new g(this, 4), new Consumer() { // from class: x2.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                kf.a.f12078a.d((Throwable) obj, "Error sending pronstore event", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "pronStoreService.sendEve…re event\")\n            })");
        DisposableKt.addTo(subscribe, this.f17760f);
    }
}
