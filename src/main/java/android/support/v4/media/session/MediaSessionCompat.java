package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import g1.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class MediaSessionCompat {
    public static final int d;

    /* renamed from: e  reason: collision with root package name */
    public static int f398e;

    /* renamed from: a  reason: collision with root package name */
    public final b f399a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaControllerCompat f400b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<h> f401c = new ArrayList<>();

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final MediaDescriptionCompat f402c;

        /* renamed from: f  reason: collision with root package name */
        public final long f403f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f402c = mediaDescriptionCompat;
            this.f403f = j10;
        }

        public QueueItem(Parcel parcel) {
            this.f402c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f403f = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("MediaSession.QueueItem {Description=");
            m10.append(this.f402c);
            m10.append(", Id=");
            m10.append(this.f403f);
            m10.append(" }");
            return m10.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f402c.writeToParcel(parcel, i10);
            parcel.writeLong(this.f403f);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public ResultReceiver f404c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f404c = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f404c.writeToParcel(parcel, i10);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final Object f405c = new Object();

        /* renamed from: f  reason: collision with root package name */
        public final Object f406f;

        /* renamed from: j  reason: collision with root package name */
        public android.support.v4.media.session.b f407j;

        /* renamed from: m  reason: collision with root package name */
        public w1.c f408m;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null, null);
            }

            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Object obj, android.support.v4.media.session.b bVar, w1.c cVar) {
            this.f406f = obj;
            this.f407j = bVar;
            this.f408m = cVar;
        }

        public android.support.v4.media.session.b a() {
            android.support.v4.media.session.b bVar;
            synchronized (this.f405c) {
                bVar = this.f407j;
            }
            return bVar;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Token) {
                Token token = (Token) obj;
                Object obj2 = this.f406f;
                if (obj2 == null) {
                    return token.f406f == null;
                }
                Object obj3 = token.f406f;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f406f;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f406f, i10);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: c  reason: collision with root package name */
        public boolean f411c;

        /* renamed from: e  reason: collision with root package name */
        public HandlerC0010a f412e;

        /* renamed from: a  reason: collision with root package name */
        public final Object f409a = new Object();

        /* renamed from: b  reason: collision with root package name */
        public final MediaSession.Callback f410b = new b();
        public WeakReference<b> d = new WeakReference<>(null);

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0010a extends Handler {
            public HandlerC0010a(Looper looper) {
                super(looper);
            }

            /* JADX WARN: Finally extract failed */
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar;
                a aVar;
                HandlerC0010a handlerC0010a;
                if (message.what == 1) {
                    synchronized (a.this.f409a) {
                        try {
                            bVar = a.this.d.get();
                            aVar = a.this;
                            handlerC0010a = aVar.f412e;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (bVar != null && aVar == bVar.f() && handlerC0010a != null) {
                        bVar.j((g1.a) message.obj);
                        a.this.a(bVar, handlerC0010a);
                        bVar.j(null);
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends MediaSession.Callback {
            public b() {
            }

            public final c a() {
                c cVar;
                a aVar;
                synchronized (a.this.f409a) {
                    cVar = (c) a.this.d.get();
                }
                if (cVar != null) {
                    a aVar2 = a.this;
                    synchronized (cVar.f417c) {
                        aVar = cVar.f422i;
                    }
                    if (aVar2 == aVar) {
                        return cVar;
                    }
                }
                return null;
            }

            public final void b(b bVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String p10 = ((c) bVar).p();
                if (TextUtils.isEmpty(p10)) {
                    p10 = "android.media.session.MediaController";
                }
                bVar.j(new g1.a(p10, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                w1.c cVar;
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = a10.f416b;
                        android.support.v4.media.session.b a11 = token.a();
                        bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", a11 == null ? null : a11.asBinder());
                        synchronized (token.f405c) {
                            cVar = token.f408m;
                        }
                        if (cVar != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(cVar));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        a aVar = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        Objects.requireNonNull(aVar);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        a aVar2 = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        Objects.requireNonNull(aVar2);
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        a aVar3 = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        Objects.requireNonNull(aVar3);
                    } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        Objects.requireNonNull(a.this);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        Objects.requireNonNull(a.this);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                        Objects.requireNonNull(a.this);
                    } else {
                        Objects.requireNonNull(a.this);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                c a10 = a();
                boolean z10 = false;
                if (a10 == null) {
                    return false;
                }
                b(a10);
                boolean b10 = a.this.b(intent);
                a10.j(null);
                if (b10 || super.onMediaButtonEvent(intent)) {
                    z10 = true;
                }
                return z10;
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.c();
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.d();
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j10) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.e(j10);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f10) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a aVar = a.this;
                RatingCompat.a(rating);
                Objects.requireNonNull(aVar);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j10) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                Objects.requireNonNull(a.this);
                a10.j(null);
            }
        }

        public void a(b bVar, Handler handler) {
            if (this.f411c) {
                boolean z10 = false;
                this.f411c = false;
                handler.removeMessages(1);
                PlaybackStateCompat g10 = bVar.g();
                long j10 = g10 == null ? 0L : g10.n;
                boolean z11 = g10 != null && g10.f433c == 3;
                boolean z12 = (516 & j10) != 0;
                if ((j10 & 514) != 0) {
                    z10 = true;
                }
                if (z11 && z10) {
                    c();
                    return;
                }
                if (!z11 && z12) {
                    d();
                }
            }
        }

        public boolean b(Intent intent) {
            b bVar;
            HandlerC0010a handlerC0010a;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f409a) {
                try {
                    bVar = this.d.get();
                    handlerC0010a = this.f412e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bVar == null || handlerC0010a == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            g1.a m10 = bVar.m();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(bVar, handlerC0010a);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                a(bVar, handlerC0010a);
            } else if (this.f411c) {
                handlerC0010a.removeMessages(1);
                this.f411c = false;
                bVar.g();
            } else {
                this.f411c = true;
                handlerC0010a.sendMessageDelayed(handlerC0010a.obtainMessage(1, m10), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void c() {
        }

        public void d() {
        }

        public void e(long j10) {
        }

        public void f(b bVar, Handler handler) {
            synchronized (this.f409a) {
                this.d = new WeakReference<>(bVar);
                HandlerC0010a handlerC0010a = this.f412e;
                HandlerC0010a handlerC0010a2 = null;
                if (handlerC0010a != null) {
                    handlerC0010a.removeCallbacksAndMessages(null);
                }
                if (bVar != null && handler != null) {
                    handlerC0010a2 = new HandlerC0010a(handler.getLooper());
                }
                this.f412e = handlerC0010a2;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        Token b();

        void c(PendingIntent pendingIntent);

        void d(a aVar, Handler handler);

        void e(int i10);

        a f();

        PlaybackStateCompat g();

        void h(MediaMetadataCompat mediaMetadataCompat);

        void i(PendingIntent pendingIntent);

        void j(g1.a aVar);

        void k(boolean z10);

        void l(PlaybackStateCompat playbackStateCompat);

        g1.a m();

        void n(g1.d dVar);
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final MediaSession f415a;

        /* renamed from: b  reason: collision with root package name */
        public final Token f416b;
        public Bundle d;

        /* renamed from: g  reason: collision with root package name */
        public PlaybackStateCompat f420g;

        /* renamed from: h  reason: collision with root package name */
        public MediaMetadataCompat f421h;

        /* renamed from: i  reason: collision with root package name */
        public a f422i;

        /* renamed from: j  reason: collision with root package name */
        public g1.a f423j;

        /* renamed from: c  reason: collision with root package name */
        public final Object f417c = new Object();

        /* renamed from: e  reason: collision with root package name */
        public boolean f418e = false;

        /* renamed from: f  reason: collision with root package name */
        public final RemoteCallbackList<android.support.v4.media.session.a> f419f = new RemoteCallbackList<>();

        /* loaded from: classes.dex */
        public class a extends b.a {
            public a() {
            }

            @Override // android.support.v4.media.session.b
            public void A(int i10, int i11, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void B(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void D(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean D0() {
                Objects.requireNonNull(c.this);
                return false;
            }

            @Override // android.support.v4.media.session.b
            public boolean E() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void G(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void G0(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> H0() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent I() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void I0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int J() {
                Objects.requireNonNull(c.this);
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void K(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void L0(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void M0(boolean z10) {
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo N0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle O0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void R0(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence S() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String U0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat V() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void W(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle X() {
                if (c.this.d == null) {
                    return null;
                }
                return new Bundle(c.this.d);
            }

            @Override // android.support.v4.media.session.b
            public void Y(android.support.v4.media.session.a aVar) {
                c.this.f419f.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public void b0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c0(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void e0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void f() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void f0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat g() {
                c cVar = c.this;
                return MediaSessionCompat.c(cVar.f420g, cVar.f421h);
            }

            @Override // android.support.v4.media.session.b
            public void h() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void k0(float f10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean l0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void n(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void n0(int i10, int i11, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String o() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void q(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void q0(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long r() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int s() {
                Objects.requireNonNull(c.this);
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void s0(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void u0(boolean z10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void v(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void x(android.support.v4.media.session.a aVar) {
                if (!c.this.f418e) {
                    c.this.f419f.register(aVar, new g1.a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public boolean y() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public int y0() {
                Objects.requireNonNull(c.this);
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void z(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void z0(int i10) {
                throw new AssertionError();
            }
        }

        public c(Context context, String str, w1.c cVar, Bundle bundle) {
            MediaSession o10 = o(context, str, bundle);
            this.f415a = o10;
            this.f416b = new Token(o10.getSessionToken(), new a(), cVar);
            this.d = bundle;
            o10.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void a() {
            Handler handler;
            this.f418e = true;
            this.f419f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f415a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    handler = (Handler) declaredField.get(this.f415a);
                } catch (Exception e10) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
                }
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    this.f415a.setCallback(null);
                    this.f415a.release();
                }
            }
            this.f415a.setCallback(null);
            this.f415a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public Token b() {
            return this.f416b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void c(PendingIntent pendingIntent) {
            this.f415a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void d(a aVar, Handler handler) {
            synchronized (this.f417c) {
                this.f422i = aVar;
                this.f415a.setCallback(aVar == null ? null : aVar.f410b, handler);
                if (aVar != null) {
                    aVar.f(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void e(int i10) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            this.f415a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public a f() {
            a aVar;
            synchronized (this.f417c) {
                aVar = this.f422i;
            }
            return aVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public PlaybackStateCompat g() {
            return this.f420g;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void h(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f421h = mediaMetadataCompat;
            MediaSession mediaSession = this.f415a;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                if (mediaMetadataCompat.f374f == null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeBundle(mediaMetadataCompat.f373c);
                    obtain.setDataPosition(0);
                    mediaMetadataCompat.f374f = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                }
                mediaMetadata = mediaMetadataCompat.f374f;
            }
            mediaSession.setMetadata(mediaMetadata);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void i(PendingIntent pendingIntent) {
            this.f415a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void j(g1.a aVar) {
            synchronized (this.f417c) {
                this.f423j = aVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void k(boolean z10) {
            this.f415a.setActive(z10);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void l(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f420g = playbackStateCompat;
            for (int beginBroadcast = this.f419f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f419f.getBroadcastItem(beginBroadcast).W0(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f419f.finishBroadcast();
            MediaSession mediaSession = this.f415a;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                if (playbackStateCompat.B == null) {
                    PlaybackState.Builder d = PlaybackStateCompat.b.d();
                    PlaybackStateCompat.b.x(d, playbackStateCompat.f433c, playbackStateCompat.f434f, playbackStateCompat.f436m, playbackStateCompat.f439w);
                    PlaybackStateCompat.b.u(d, playbackStateCompat.f435j);
                    PlaybackStateCompat.b.s(d, playbackStateCompat.n);
                    PlaybackStateCompat.b.v(d, playbackStateCompat.f438u);
                    for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.y) {
                        PlaybackState.CustomAction customAction2 = customAction.n;
                        if (customAction2 == null) {
                            PlaybackState.CustomAction.Builder e10 = PlaybackStateCompat.b.e(customAction.f441c, customAction.f442f, customAction.f443j);
                            PlaybackStateCompat.b.w(e10, customAction.f444m);
                            customAction2 = PlaybackStateCompat.b.b(e10);
                        }
                        PlaybackStateCompat.b.a(d, customAction2);
                    }
                    PlaybackStateCompat.b.t(d, playbackStateCompat.f440z);
                    if (Build.VERSION.SDK_INT >= 22) {
                        PlaybackStateCompat.c.b(d, playbackStateCompat.A);
                    }
                    playbackStateCompat.B = PlaybackStateCompat.b.c(d);
                }
                playbackState = playbackStateCompat.B;
            }
            mediaSession.setPlaybackState(playbackState);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public g1.a m() {
            g1.a aVar;
            synchronized (this.f417c) {
                aVar = this.f423j;
            }
            return aVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void n(g1.d dVar) {
            this.f415a.setPlaybackToRemote((VolumeProvider) dVar.a());
        }

        public MediaSession o(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        public String p() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f415a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f415a, new Object[0]);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public d(Context context, String str, w1.c cVar, Bundle bundle) {
            super(context, str, cVar, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public e(Context context, String str, w1.c cVar, Bundle bundle) {
            super(context, str, cVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        public void j(g1.a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        public final g1.a m() {
            return new g1.a(this.f415a.getCurrentControllerInfo());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends e {
        public f(Context context, String str, w1.c cVar, Bundle bundle) {
            super(context, str, cVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public MediaSession o(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class g implements b {

        /* renamed from: a  reason: collision with root package name */
        public int f425a;

        /* renamed from: b  reason: collision with root package name */
        public int f426b;

        /* renamed from: c  reason: collision with root package name */
        public g1.d f427c;

        /* loaded from: classes.dex */
        public class a extends d.AbstractC0138d {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ g f428a;
        }

        public void o(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    static {
        d = i0.a.a() ? 33554432 : 0;
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, d);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            this.f399a = new f(context, str, null, null);
        } else if (i10 >= 28) {
            this.f399a = new e(context, str, null, null);
        } else if (i10 >= 22) {
            this.f399a = new d(context, str, null, null);
        } else {
            this.f399a = new c(context, str, null, null);
        }
        e(new android.support.v4.media.session.c(this), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        this.f399a.i(pendingIntent);
        this.f400b = new MediaControllerCompat(context, this);
        if (f398e == 0) {
            f398e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static PlaybackStateCompat c(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat != null) {
            long j10 = -1;
            if (playbackStateCompat.f434f == -1) {
                return playbackStateCompat;
            }
            int i10 = playbackStateCompat.f433c;
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                long j11 = playbackStateCompat.f439w;
                if (j11 > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j12 = (playbackStateCompat.f436m * ((float) (elapsedRealtime - j11))) + playbackStateCompat.f434f;
                    if (mediaMetadataCompat != null && mediaMetadataCompat.f373c.containsKey("android.media.metadata.DURATION")) {
                        j10 = mediaMetadataCompat.f373c.getLong("android.media.metadata.DURATION", 0L);
                    }
                    long j13 = (j10 < 0 || j12 <= j10) ? j12 < 0 ? 0L : j12 : j10;
                    ArrayList arrayList = new ArrayList();
                    long j14 = playbackStateCompat.f435j;
                    long j15 = playbackStateCompat.n;
                    int i11 = playbackStateCompat.f437t;
                    CharSequence charSequence = playbackStateCompat.f438u;
                    List<PlaybackStateCompat.CustomAction> list = playbackStateCompat.y;
                    if (list != null) {
                        arrayList.addAll(list);
                    }
                    return new PlaybackStateCompat(playbackStateCompat.f433c, j13, j14, playbackStateCompat.f436m, j15, i11, charSequence, elapsedRealtime, arrayList, playbackStateCompat.f440z, playbackStateCompat.A);
                }
                return playbackStateCompat;
            }
            return playbackStateCompat;
        }
        return playbackStateCompat;
    }

    public static Bundle f(Bundle bundle) {
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public Token b() {
        return this.f399a.b();
    }

    public void d(boolean z10) {
        this.f399a.k(z10);
        Iterator<h> it = this.f401c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void e(a aVar, Handler handler) {
        if (aVar == null) {
            this.f399a.d(null, null);
            return;
        }
        b bVar = this.f399a;
        if (handler == null) {
            handler = new Handler();
        }
        bVar.d(aVar, handler);
    }
}
