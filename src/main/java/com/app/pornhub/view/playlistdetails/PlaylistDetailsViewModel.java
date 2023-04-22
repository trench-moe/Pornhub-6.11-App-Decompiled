package com.app.pornhub.view.playlistdetails;

import androidx.lifecycle.p;
import b5.d;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.video.VideoMetaData;
import f3.o;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import j3.b;
import j3.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v3.d;

/* loaded from: classes.dex */
public final class PlaylistDetailsViewModel extends d implements d.a {
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public final e f5433e;

    /* renamed from: f  reason: collision with root package name */
    public final b f5434f;

    /* renamed from: g  reason: collision with root package name */
    public final Lazy f5435g;

    /* renamed from: h  reason: collision with root package name */
    public final p<a> f5436h;

    /* renamed from: i  reason: collision with root package name */
    public final p<List<VideoMetaData>> f5437i;

    /* renamed from: j  reason: collision with root package name */
    public final List<VideoMetaData> f5438j;

    /* renamed from: k  reason: collision with root package name */
    public final List<VideoMetaData> f5439k;

    /* renamed from: l  reason: collision with root package name */
    public final p<Boolean> f5440l;

    /* renamed from: m  reason: collision with root package name */
    public final p<Boolean> f5441m;
    public long n;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0060a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0060a f5442a = new C0060a();

            public C0060a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5443a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5444a;

            /* renamed from: b  reason: collision with root package name */
            public final Throwable f5445b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z10, Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f5444a = z10;
                this.f5445b = throwable;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (this.f5444a == cVar.f5444a && Intrinsics.areEqual(this.f5445b, cVar.f5445b)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4 */
            public int hashCode() {
                boolean z10 = this.f5444a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                return this.f5445b.hashCode() + (r02 * 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ErrorLoading(isGay=");
                m10.append(this.f5444a);
                m10.append(", throwable=");
                m10.append(this.f5445b);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f5446a = new d();

            public d() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f5447a = new e();

            public e() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final f f5448a = new f();

            public f() {
                super(null);
            }
        }

        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PlaylistDetailsViewModel(o getUserSettingsUseCase, e getPlaylistUseCase, b cachePlaylistForPlaybackUseCase) {
        Intrinsics.checkNotNullParameter(getUserSettingsUseCase, "getUserSettingsUseCase");
        Intrinsics.checkNotNullParameter(getPlaylistUseCase, "getPlaylistUseCase");
        Intrinsics.checkNotNullParameter(cachePlaylistForPlaybackUseCase, "cachePlaylistForPlaybackUseCase");
        this.d = getUserSettingsUseCase;
        this.f5433e = getPlaylistUseCase;
        this.f5434f = cachePlaylistForPlaybackUseCase;
        this.f5435g = LazyKt.lazy(new Function0<p<Playlist>>() { // from class: com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel$playlistLiveData$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public p<Playlist> invoke() {
                p<Playlist> pVar = new p<>();
                PlaylistDetailsViewModel playlistDetailsViewModel = PlaylistDetailsViewModel.this;
                playlistDetailsViewModel.f5440l.l(Boolean.FALSE);
                playlistDetailsViewModel.d();
                return pVar;
            }
        });
        this.f5436h = new p<>();
        this.f5437i = new p<>();
        this.f5438j = new ArrayList();
        this.f5439k = new ArrayList();
        this.f5440l = new p<>();
        this.f5441m = new p<>();
    }

    public final void c(List<VideoMetaData> list) {
        this.f5438j.addAll(list);
        this.f5439k.addAll(CollectionsKt.shuffled(list));
        Boolean d = this.f5440l.d();
        Intrinsics.checkNotNull(d);
        Intrinsics.checkNotNullExpressionValue(d, "shuffleLiveData.value!!");
        if (d.booleanValue()) {
            this.f5437i.l(this.f5439k);
        } else {
            this.f5437i.l(this.f5438j);
        }
    }

    public final void d() {
        Disposable subscribe = this.f5433e.a(this.n, 0).subscribe(new x2.a(this, 17));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getPlaylistUseCase.execu…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }

    public final p<Playlist> e() {
        return (p) this.f5435g.getValue();
    }

    public final void f(Playlist playlist, String str) {
        Intrinsics.checkNotNullParameter(playlist, "playlist");
        b bVar = this.f5434f;
        Objects.requireNonNull(bVar);
        Intrinsics.checkNotNullParameter(playlist, "playlist");
        bVar.f11370a.h(playlist, this.f5437i.d(), str);
    }
}
