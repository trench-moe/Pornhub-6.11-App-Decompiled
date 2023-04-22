package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    public final InternalRewinder f5682a;

    /* loaded from: classes.dex */
    public static final class InternalRewinder {

        /* renamed from: a  reason: collision with root package name */
        public final ParcelFileDescriptor f5683a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f5683a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() {
            try {
                Os.lseek(this.f5683a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f5683a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f5682a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c */
    public ParcelFileDescriptor a() {
        return this.f5682a.rewind();
    }
}
