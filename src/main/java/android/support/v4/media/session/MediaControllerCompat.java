package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import b7.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    public final b f383a;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<a, Boolean> f384b = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 implements b {

        /* renamed from: a  reason: collision with root package name */
        public final MediaController f385a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f386b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f387c = new ArrayList();
        public HashMap<a, a> d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        public final MediaSessionCompat.Token f388e;

        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: c  reason: collision with root package name */
            public WeakReference<MediaControllerImplApi21> f389c;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f389c = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f389c.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f386b) {
                    MediaSessionCompat.Token token = mediaControllerImplApi21.f388e;
                    android.support.v4.media.session.b a12 = b.a.a1(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
                    synchronized (token.f405c) {
                        token.f407j = a12;
                    }
                    MediaSessionCompat.Token token2 = mediaControllerImplApi21.f388e;
                    w1.c cVar = null;
                    try {
                        Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                        if (bundle2 != null) {
                            bundle2.setClassLoader(k.class.getClassLoader());
                            Parcelable parcelable = bundle2.getParcelable("a");
                            if (!(parcelable instanceof ParcelImpl)) {
                                throw new IllegalArgumentException("Invalid parcel");
                            }
                            cVar = ((ParcelImpl) parcelable).f3279c;
                        }
                    } catch (RuntimeException unused) {
                    }
                    synchronized (token2.f405c) {
                        token2.f408m = cVar;
                    }
                    mediaControllerImplApi21.a();
                }
            }
        }

        /* loaded from: classes.dex */
        public static class a extends a.c {
            public a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void N(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void P(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void Z0(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void m0(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void r0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public void t0(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f388e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f406f);
            this.f385a = mediaController;
            if (token.a() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        public void a() {
            if (this.f388e.a() == null) {
                return;
            }
            for (a aVar : this.f387c) {
                a aVar2 = new a(aVar);
                this.d.put(aVar, aVar2);
                aVar.f392c = aVar2;
                try {
                    this.f388e.a().x(aVar2);
                    aVar.d(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            this.f387c.clear();
        }

        public final void b(a aVar) {
            this.f385a.unregisterCallback(aVar.f390a);
            synchronized (this.f386b) {
                if (this.f388e.a() != null) {
                    try {
                        a remove = this.d.remove(aVar);
                        if (remove != null) {
                            aVar.f392c = null;
                            this.f388e.a().Y(remove);
                        }
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e10);
                    }
                } else {
                    this.f387c.remove(aVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final MediaController.Callback f390a = new C0009a(this);

        /* renamed from: b  reason: collision with root package name */
        public b f391b;

        /* renamed from: c  reason: collision with root package name */
        public android.support.v4.media.session.a f392c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0009a extends MediaController.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f393a;

            public C0009a(a aVar) {
                this.f393a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.f393a.get() != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.f393a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.f393a.get();
                if (aVar != null) {
                    aVar.a(MediaMetadataCompat.a(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.f393a.get();
                if (aVar != null && aVar.f392c == null) {
                    aVar.b(PlaybackStateCompat.a(playbackState));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                MediaSessionCompat.QueueItem queueItem;
                if (this.f393a.get() == null || list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (MediaSession.QueueItem queueItem2 : list) {
                    if (queueItem2 != null) {
                        MediaSession.QueueItem queueItem3 = queueItem2;
                        queueItem = new MediaSessionCompat.QueueItem(queueItem3, MediaDescriptionCompat.a(MediaSessionCompat.QueueItem.b.b(queueItem3)), MediaSessionCompat.QueueItem.b.c(queueItem3));
                    } else {
                        queueItem = null;
                    }
                    arrayList.add(queueItem);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                this.f393a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = this.f393a.get();
                if (aVar != null) {
                    aVar.c();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.f393a.get();
            }
        }

        /* loaded from: classes.dex */
        public class b extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public boolean f394a;

            public b(Looper looper) {
                super(looper);
                this.f394a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f394a) {
                    switch (message.what) {
                        case 1:
                            MediaSessionCompat.a(message.getData());
                            a aVar = a.this;
                            String str = (String) message.obj;
                            Objects.requireNonNull(aVar);
                            return;
                        case 2:
                            a.this.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            a.this.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            a aVar2 = a.this;
                            d dVar = (d) message.obj;
                            Objects.requireNonNull(aVar2);
                            return;
                        case 5:
                            a aVar3 = a.this;
                            List list = (List) message.obj;
                            Objects.requireNonNull(aVar3);
                            return;
                        case 6:
                            a aVar4 = a.this;
                            CharSequence charSequence = (CharSequence) message.obj;
                            Objects.requireNonNull(aVar4);
                            return;
                        case 7:
                            MediaSessionCompat.a((Bundle) message.obj);
                            Objects.requireNonNull(a.this);
                            return;
                        case 8:
                            a.this.c();
                            return;
                        case 9:
                            a aVar5 = a.this;
                            ((Integer) message.obj).intValue();
                            Objects.requireNonNull(aVar5);
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            a aVar6 = a.this;
                            ((Boolean) message.obj).booleanValue();
                            Objects.requireNonNull(aVar6);
                            return;
                        case 12:
                            a aVar7 = a.this;
                            ((Integer) message.obj).intValue();
                            Objects.requireNonNull(aVar7);
                            return;
                        case 13:
                            Objects.requireNonNull(a.this);
                            return;
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class c extends a.AbstractBinderC0011a {

            /* renamed from: b  reason: collision with root package name */
            public final WeakReference<a> f396b;

            public c(a aVar) {
                this.f396b = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void W0(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.f396b.get();
                if (aVar != null) {
                    aVar.d(2, playbackStateCompat, null);
                }
            }
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void b(PlaybackStateCompat playbackStateCompat) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            d(8, null, null);
        }

        public void c() {
        }

        public void d(int i10, Object obj, Bundle bundle) {
            b bVar = this.f391b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i10, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public void e(Handler handler) {
            if (handler == null) {
                b bVar = this.f391b;
                if (bVar != null) {
                    bVar.f394a = false;
                    bVar.removeCallbacksAndMessages(null);
                    this.f391b = null;
                }
            } else {
                b bVar2 = new b(handler.getLooper());
                this.f391b = bVar2;
                bVar2.f394a = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public static class f extends e {

        /* renamed from: a  reason: collision with root package name */
        public final MediaController.TransportControls f397a;

        public f(MediaController.TransportControls transportControls) {
            this.f397a = transportControls;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {
        public g(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {
        public i(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        this.f383a = new MediaControllerImplApi21(context, token);
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        MediaSessionCompat.Token b10 = mediaSessionCompat.b();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f383a = new c(context, b10);
        } else {
            this.f383a = new MediaControllerImplApi21(context, b10);
        }
    }

    public MediaMetadataCompat a() {
        MediaMetadata metadata = ((MediaControllerImplApi21) this.f383a).f385a.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.a(metadata);
        }
        return null;
    }

    public e b() {
        MediaController.TransportControls transportControls = ((MediaControllerImplApi21) this.f383a).f385a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new i(transportControls) : i10 >= 24 ? new h(transportControls) : i10 >= 23 ? new g(transportControls) : new f(transportControls);
    }

    public void c(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f384b.putIfAbsent(aVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        aVar.e(handler);
        MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f383a;
        mediaControllerImplApi21.f385a.registerCallback(aVar.f390a, handler);
        synchronized (mediaControllerImplApi21.f386b) {
            if (mediaControllerImplApi21.f388e.a() != null) {
                MediaControllerImplApi21.a aVar2 = new MediaControllerImplApi21.a(aVar);
                mediaControllerImplApi21.d.put(aVar, aVar2);
                aVar.f392c = aVar2;
                try {
                    mediaControllerImplApi21.f388e.a().x(aVar2);
                    aVar.d(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            } else {
                aVar.f392c = null;
                mediaControllerImplApi21.f387c.add(aVar);
            }
        }
    }

    public void d(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f384b.remove(aVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((MediaControllerImplApi21) this.f383a).b(aVar);
            aVar.e(null);
        } catch (Throwable th) {
            aVar.e(null);
            throw th;
        }
    }
}
