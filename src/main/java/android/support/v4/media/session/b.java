package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f447a = 0;

        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0013a implements b {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f448a;

            public C0013a(IBinder iBinder) {
                this.f448a = iBinder;
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent I() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f448a.transact(8, obtain, obtain2, 0)) {
                        int i10 = a.f447a;
                    }
                    obtain2.readException();
                    PendingIntent pendingIntent = obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return pendingIntent;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat V() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f448a.transact(27, obtain, obtain2, 0)) {
                        int i10 = a.f447a;
                    }
                    obtain2.readException();
                    MediaMetadataCompat createFromParcel = obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void Y(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (!this.f448a.transact(4, obtain, obtain2, 0)) {
                        int i10 = a.f447a;
                    }
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f448a;
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f448a.transact(28, obtain, obtain2, 0)) {
                        int i10 = a.f447a;
                    }
                    obtain2.readException();
                    PlaybackStateCompat createFromParcel = obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f448a.transact(13, obtain, obtain2, 0)) {
                        int i10 = a.f447a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.b
            public void pause() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f448a.transact(18, obtain, obtain2, 0)) {
                        int i10 = a.f447a;
                    }
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void stop() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f448a.transact(19, obtain, obtain2, 0)) {
                        int i10 = a.f447a;
                    }
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.support.v4.media.session.b
            public void x(android.support.v4.media.session.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder((a.AbstractBinderC0011a) aVar);
                    if (!this.f448a.transact(3, obtain, obtain2, 0)) {
                        int i10 = a.f447a;
                    }
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b a1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0013a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            boolean z10 = false;
            MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper = null;
            switch (i10) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString = parcel.readString();
                    Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper2 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        resultReceiverWrapper2 = MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel);
                    }
                    G0(readString, bundle, resultReceiverWrapper2);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    KeyEvent keyEvent = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                    }
                    boolean l02 = l0(keyEvent);
                    parcel2.writeNoException();
                    parcel2.writeInt(l02 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    x(a.AbstractBinderC0011a.a1(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Y(a.AbstractBinderC0011a.a1(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean E = E();
                    parcel2.writeNoException();
                    parcel2.writeInt(E ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String U0 = U0();
                    parcel2.writeNoException();
                    parcel2.writeString(U0);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String o10 = o();
                    parcel2.writeNoException();
                    parcel2.writeString(o10);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent I = I();
                    parcel2.writeNoException();
                    if (I != null) {
                        parcel2.writeInt(1);
                        I.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long r10 = r();
                    parcel2.writeNoException();
                    parcel2.writeLong(r10);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    ParcelableVolumeInfo N0 = N0();
                    parcel2.writeNoException();
                    if (N0 != null) {
                        parcel2.writeInt(1);
                        N0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n0(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    A(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    h();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString2 = parcel.readString();
                    Bundle bundle2 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    b0(readString2, bundle2);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString3 = parcel.readString();
                    Bundle bundle3 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    c0(readString3, bundle3);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Uri uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle4 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    f0(uri, bundle4);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    L0(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    e0();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    I0();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    RatingCompat ratingCompat = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        ratingCompat = RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    z(ratingCompat);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString4 = parcel.readString();
                    Bundle bundle5 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    v(readString4, bundle5);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaMetadataCompat V = V();
                    parcel2.writeNoException();
                    if (V != null) {
                        parcel2.writeInt(1);
                        parcel2.writeBundle(V.f373c);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PlaybackStateCompat g10 = g();
                    parcel2.writeNoException();
                    if (g10 != null) {
                        parcel2.writeInt(1);
                        g10.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List<MediaSessionCompat.QueueItem> H0 = H0();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(H0);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence S = S();
                    parcel2.writeNoException();
                    if (S != null) {
                        parcel2.writeInt(1);
                        TextUtils.writeToParcel(S, parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle O0 = O0();
                    parcel2.writeNoException();
                    if (O0 != null) {
                        parcel2.writeInt(1);
                        O0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int J = J();
                    parcel2.writeNoException();
                    parcel2.writeInt(J);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    f();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString5 = parcel.readString();
                    Bundle bundle6 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        bundle6 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    W(readString5, bundle6);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String readString6 = parcel.readString();
                    Bundle bundle7 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        bundle7 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    K(readString6, bundle7);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Uri uri2 = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle8 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        bundle8 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    B(uri2, bundle8);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int s10 = s();
                    parcel2.writeNoException();
                    parcel2.writeInt(s10);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean y = y();
                    parcel2.writeNoException();
                    parcel2.writeInt(y ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    q(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    M0(z10);
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaDescriptionCompat mediaDescriptionCompat = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    G(mediaDescriptionCompat);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaDescriptionCompat mediaDescriptionCompat2 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat2 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    s0(mediaDescriptionCompat2, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    MediaDescriptionCompat mediaDescriptionCompat3 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        mediaDescriptionCompat3 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    D(mediaDescriptionCompat3);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    z0(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean D0 = D0();
                    parcel2.writeNoException();
                    parcel2.writeInt(D0 ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        z10 = true;
                    }
                    u0(z10);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int y02 = y0();
                    parcel2.writeNoException();
                    parcel2.writeInt(y02);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    R0(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 49:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    k0(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle X = X();
                    parcel2.writeNoException();
                    if (X != null) {
                        parcel2.writeInt(1);
                        X.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    RatingCompat createFromParcel = parcel.readInt() != 0 ? RatingCompat.CREATOR.createFromParcel(parcel) : null;
                    Bundle bundle9 = resultReceiverWrapper;
                    if (parcel.readInt() != 0) {
                        bundle9 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    q0(createFromParcel, bundle9);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void A(int i10, int i11, String str);

    void B(Uri uri, Bundle bundle);

    void D(MediaDescriptionCompat mediaDescriptionCompat);

    boolean D0();

    boolean E();

    void G(MediaDescriptionCompat mediaDescriptionCompat);

    void G0(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    List<MediaSessionCompat.QueueItem> H0();

    PendingIntent I();

    void I0();

    int J();

    void K(String str, Bundle bundle);

    void L0(long j10);

    void M0(boolean z10);

    ParcelableVolumeInfo N0();

    Bundle O0();

    void R0(int i10);

    CharSequence S();

    String U0();

    MediaMetadataCompat V();

    void W(String str, Bundle bundle);

    Bundle X();

    void Y(android.support.v4.media.session.a aVar);

    void b0(String str, Bundle bundle);

    void c0(String str, Bundle bundle);

    void e0();

    void f();

    void f0(Uri uri, Bundle bundle);

    PlaybackStateCompat g();

    void h();

    void k0(float f10);

    boolean l0(KeyEvent keyEvent);

    void n(long j10);

    void n0(int i10, int i11, String str);

    void next();

    String o();

    void pause();

    void previous();

    void q(int i10);

    void q0(RatingCompat ratingCompat, Bundle bundle);

    long r();

    int s();

    void s0(MediaDescriptionCompat mediaDescriptionCompat, int i10);

    void stop();

    void u0(boolean z10);

    void v(String str, Bundle bundle);

    void x(android.support.v4.media.session.a aVar);

    boolean y();

    int y0();

    void z(RatingCompat ratingCompat);

    void z0(int i10);
}
