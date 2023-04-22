package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0011a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f445a = 0;

        /* renamed from: android.support.v4.media.session.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0012a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f446a;

            public C0012a(IBinder iBinder) {
                this.f446a = iBinder;
            }

            @Override // android.support.v4.media.session.a
            public void W0(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f446a.transact(3, obtain, null, 1)) {
                        int i10 = AbstractBinderC0011a.f445a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* JADX WARN: Finally extract failed */
            @Override // android.support.v4.media.session.a
            public void Z0(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f446a.transact(8, obtain, null, 1)) {
                        int i10 = AbstractBinderC0011a.f445a;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f446a;
            }

            @Override // android.support.v4.media.session.a
            public void r0() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (!this.f446a.transact(2, obtain, null, 1)) {
                        int i10 = AbstractBinderC0011a.f445a;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            /* JADX WARN: Finally extract failed */
            @Override // android.support.v4.media.session.a
            public void t0(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        obtain.writeBundle(mediaMetadataCompat.f373c);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f446a.transact(4, obtain, null, 1)) {
                        int i10 = AbstractBinderC0011a.f445a;
                    }
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public AbstractBinderC0011a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static a a1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0012a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    String readString = parcel.readString();
                    Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    MediaControllerCompat.a aVar = ((MediaControllerCompat.a.c) this).f396b.get();
                    if (aVar != null) {
                        aVar.d(1, readString, bundle);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    r0();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    ((MediaControllerCompat.a.c) this).W0(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    t0(parcel.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    P(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    m0(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    N(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    Z0(parcel.readInt() != 0 ? ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int readInt = parcel.readInt();
                    MediaControllerCompat.a aVar2 = ((MediaControllerCompat.a.c) this).f396b.get();
                    if (aVar2 != null) {
                        aVar2.d(9, Integer.valueOf(readInt), null);
                    }
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    boolean z10 = parcel.readInt() != 0;
                    MediaControllerCompat.a aVar3 = ((MediaControllerCompat.a.c) this).f396b.get();
                    if (aVar3 != null) {
                        aVar3.d(11, Boolean.valueOf(z10), null);
                    }
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    int readInt2 = parcel.readInt();
                    MediaControllerCompat.a aVar4 = ((MediaControllerCompat.a.c) this).f396b.get();
                    if (aVar4 != null) {
                        aVar4.d(12, Integer.valueOf(readInt2), null);
                    }
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    MediaControllerCompat.a aVar5 = ((MediaControllerCompat.a.c) this).f396b.get();
                    if (aVar5 != null) {
                        aVar5.d(13, null, null);
                    }
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    void N(Bundle bundle);

    void P(List<MediaSessionCompat.QueueItem> list);

    void W0(PlaybackStateCompat playbackStateCompat);

    void Z0(ParcelableVolumeInfo parcelableVolumeInfo);

    void m0(CharSequence charSequence);

    void r0();

    void t0(MediaMetadataCompat mediaMetadataCompat);
}
