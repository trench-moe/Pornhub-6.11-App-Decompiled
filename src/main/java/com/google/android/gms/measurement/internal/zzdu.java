package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.f0;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.i;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.p;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.t;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.w;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.y;
import com.google.android.gms.internal.measurement.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w9.a8;
import w9.b9;
import w9.c8;
import w9.g8;
import w9.h4;
import w9.h9;
import w9.j9;
import w9.m8;
import w9.o4;
import w9.o9;
import w9.s9;
import w9.u9;
import w9.x8;
import w9.y7;
import w9.z8;

/* loaded from: classes.dex */
public final class zzdu {
    public static final zzdt zzJ;
    public static final zzdt zzK;
    public static final zzdt zzL;
    public static final zzdt zzM;
    public static final zzdt zzN;
    public static final zzdt zzO;
    public static final zzdt zzP;
    public static final zzdt zzQ;
    public static final zzdt zzR;
    public static final zzdt zzS;
    public static final zzdt zzT;
    public static final zzdt zzU;
    public static final zzdt zzV;
    public static final zzdt zzW;
    public static final zzdt zzX;
    public static final zzdt zzY;
    public static final zzdt zzZ;
    public static final zzdt zzaa;
    public static final zzdt zzab;
    public static final zzdt zzac;
    public static final zzdt zzad;
    public static final zzdt zzae;
    public static final zzdt zzaf;
    public static final zzdt zzag;
    public static final zzdt zzah;
    public static final zzdt zzai;
    public static final zzdt zzaj;
    public static final zzdt zzak;
    public static final zzdt zzal;
    public static final zzdt zzam;
    public static final zzdt zzan;
    public static final zzdt zzao;
    public static final zzdt zzap;
    public static final zzdt zzaq;
    public static final zzdt zzar;
    public static final zzdt zzas;
    public static final zzdt zzat;
    public static final zzdt zzau;
    public static final zzdt zzav;
    public static final zzdt zzaw;
    public static final zzdt zzax;
    private static final List zzay = Collections.synchronizedList(new ArrayList());
    private static final Set zzaz = Collections.synchronizedSet(new HashSet());
    public static final zzdt zza = zza("measurement.ad_id_cache_time", 10000L, 10000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzaw
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().zza());
        }
    });
    public static final zzdt zzb = zza("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbh
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().zzk());
        }
    });
    public static final zzdt zzc = zza("measurement.config.cache_time", 86400000L, 3600000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzaz
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().a());
        }
    });
    public static final zzdt zzd = zza("measurement.config.url_scheme", "https", "https", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbl
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return m.f7007f.a().A();
        }
    });
    public static final zzdt zze = zza("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbx
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return m.f7007f.a().o();
        }
    });
    public static final zzdt zzf = zza("measurement.upload.max_bundles", 100, 100, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcj
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().w());
        }
    });
    public static final zzdt zzg = zza("measurement.upload.max_batch_size", 65536, 65536, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcv
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().z());
        }
    });
    public static final zzdt zzh = zza("measurement.upload.max_bundle_size", 65536, 65536, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdh
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().t());
        }
    });
    public static final zzdt zzi = zza("measurement.upload.max_events_per_bundle", 1000, 1000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdl
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().i());
        }
    });
    public static final zzdt zzj = zza("measurement.upload.max_events_per_day", 100000, 100000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdm
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().m());
        }
    });
    public static final zzdt zzk = zza("measurement.upload.max_error_events_per_day", 1000, 1000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbs
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().r());
        }
    });
    public static final zzdt zzl = zza("measurement.upload.max_public_events_per_day", 50000, 50000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcd
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().n());
        }
    });
    public static final zzdt zzm = zza("measurement.upload.max_conversions_per_day", 10000, 10000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzco
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().y());
        }
    });
    public static final zzdt zzn = zza("measurement.upload.max_realtime_events_per_day", 10, 10, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcz
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().v());
        }
    });
    public static final zzdt zzo = zza("measurement.store.max_stored_events_per_app", 100000, 100000, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdk
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().e());
        }
    });
    public static final zzdt zzp = zza("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdn
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return m.f7007f.a().B();
        }
    });
    public static final zzdt zzq = zza("measurement.upload.backoff_period", 43200000L, 43200000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdo
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().f());
        }
    });
    public static final zzdt zzr = zza("measurement.upload.window_interval", 3600000L, 3600000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdp
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().l());
        }
    });
    public static final zzdt zzs = zza("measurement.upload.interval", 3600000L, 3600000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzax
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().k());
        }
    });
    public static final zzdt zzt = zza("measurement.upload.realtime_upload_interval", 10000L, 10000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzay
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().h());
        }
    });
    public static final zzdt zzu = zza("measurement.upload.debug_upload_interval", 1000L, 1000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzba
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().c());
        }
    });
    public static final zzdt zzv = zza("measurement.upload.minimum_delay", 500L, 500L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbb
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().zzj());
        }
    });
    public static final zzdt zzw = zza("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbc
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().zzi());
        }
    });
    public static final zzdt zzx = zza("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbd
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().g());
        }
    });
    public static final zzdt zzy = zza("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbe
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().x());
        }
    });
    public static final zzdt zzz = zza("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbf
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().p());
        }
    });
    public static final zzdt zzA = zza("measurement.upload.retry_time", 1800000L, 1800000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbg
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().u());
        }
    });
    public static final zzdt zzB = zza("measurement.upload.retry_count", 6, 6, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbi
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().s());
        }
    });
    public static final zzdt zzC = zza("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbj
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().C());
        }
    });
    public static final zzdt zzD = zza("measurement.lifetimevalue.max_currency_tracked", 4, 4, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbk
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().d());
        }
    });
    public static final zzdt zzE = zza("measurement.audience.filter_result_max_count", 200, 200, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbm
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Integer.valueOf((int) m.f7007f.a().zzh());
        }
    });
    public static final zzdt zzF = zza("measurement.upload.max_public_user_properties", 25, 25, null);
    public static final zzdt zzG = zza("measurement.upload.max_event_name_cardinality", 500, 500, null);
    public static final zzdt zzH = zza("measurement.upload.max_public_event_params", 25, 25, null);
    public static final zzdt zzI = zza("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbn
        @Override // com.google.android.gms.measurement.internal.zzdq
        public final Object zza() {
            zzdt zzdtVar = zzdu.zza;
            return Long.valueOf(m.f7007f.a().q());
        }
    });

    static {
        Boolean bool = Boolean.FALSE;
        zzJ = zza("measurement.test.boolean_flag", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(y.f7031f.a().d());
            }
        });
        zzK = zza("measurement.test.string_flag", "---", "---", new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return y.f7031f.a().c();
            }
        });
        zzL = zza("measurement.test.long_flag", -1L, -1L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(y.f7031f.a().a());
            }
        });
        zzM = zza("measurement.test.int_flag", -2, -2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) y.f7031f.a().zzb());
            }
        });
        Double valueOf = Double.valueOf(-3.0d);
        zzN = zza("measurement.test.double_flag", valueOf, valueOf, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Double.valueOf(y.f7031f.a().zza());
            }
        });
        zzO = zza("measurement.experiment.max_ids", 50, 50, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) m.f7007f.a().b());
            }
        });
        zzP = zza("measurement.max_bundles_per_iteration", 100, 100, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) m.f7007f.a().zzb());
            }
        });
        zzQ = zza("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Long.valueOf(m.f7007f.a().j());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzR = zza("measurement.validation.internal_limits_internal_event_params", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((b9) x.f7029f.f7030c.zza()).zza());
            }
        });
        zzS = zza("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((h9) a0.f6982f.f6983c.zza()).zza());
            }
        });
        zzT = zza("measurement.quality.checksum", bool, bool, null);
        zzU = zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(t.f7021f.a().a());
            }
        });
        zzV = zza("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(t.f7021f.a().zzb());
            }
        });
        zzW = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(t.f7021f.a().c());
            }
        });
        zzX = zza("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((s9) f0.f6994f.f6995c.zza()).zza());
            }
        });
        zzY = zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((x8) v.f7025f.f7026c.zza()).zza());
            }
        });
        zzZ = zza("measurement.lifecycle.app_in_background_parameter", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((z8) w.f7027f.f7028c.zza()).zza());
            }
        });
        zzaa = zza("measurement.integration.disable_firebase_instance_id", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(e0.f6990f.a().zzb());
            }
        });
        zzab = zza("measurement.collection.service.update_with_analytics_fix", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((u9) g0.f6996f.f6997c.zza()).zza());
            }
        });
        zzac = zza("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(r.f7017f.a().zzb());
            }
        });
        zzad = zza("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(u.f7023f.a().zzb());
            }
        });
        zzae = zza("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((j9) b0.f6984f.f6985c.zza()).zza());
            }
        });
        zzaf = zza("measurement.upload.file_truncate_fix", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((m8) q.f7015f.f7016c.zza()).zza());
            }
        });
        zzag = zza("measurement.collection.synthetic_data_mitigation", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((o9) d0.f6988f.f6989c.zza()).zza());
            }
        });
        zzah = zza("measurement.androidId.delete_feature", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((y7) j.f7001f.f7002c.zza()).zza());
            }
        });
        zzai = zza("measurement.service.storage_consent_support_version", 203600, 203600, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Integer.valueOf((int) ((g8) n.f7009f.f7010c.zza()).zza());
            }
        });
        zzaj = zza("measurement.client.click_identifier_control.dev", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((a8) k.f7003f.f7004c.zza()).zza());
            }
        });
        zzak = zza("measurement.service.click_identifier_control", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(((c8) l.f7005f.f7006c.zza()).zza());
            }
        });
        zzal = zza("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(s.f7019f.a().zzb());
            }
        });
        zzam = zza("measurement.module.pixie.fix_array", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(z.f7033f.a().zzb());
            }
        });
        zzan = zza("measurement.adid_zero.service", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(i.f6999f.a().a());
            }
        });
        zzao = zza("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(i.f6999f.a().d());
            }
        });
        zzap = zza("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(i.f6999f.a().e());
            }
        });
        zzaq = zza("measurement.adid_zero.remove_lair_on_id_value_change_only", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(i.f6999f.a().b());
            }
        });
        zzar = zza("measurement.adid_zero.adid_uid", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(i.f6999f.a().c());
            }
        });
        zzas = zza("measurement.adid_zero.app_instance_id_fix", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(i.f6999f.a().zzb());
            }
        });
        zzat = zza("measurement.service.refactor.package_side_screen", bool2, bool2, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(c0.f6986f.a().zzb());
            }
        });
        zzau = zza("measurement.enhanced_campaign.service", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(o.f7011f.a().a());
            }
        });
        zzav = zza("measurement.enhanced_campaign.client", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(o.f7011f.a().zzb());
            }
        });
        zzaw = zza("measurement.service.store_null_safelist", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(p.f7013f.a().zzb());
            }
        });
        zzax = zza("measurement.service.store_safelist", bool, bool, new zzdq() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzdq
            public final Object zza() {
                zzdt zzdtVar = zzdu.zza;
                return Boolean.valueOf(p.f7013f.a().a());
            }
        });
    }

    public static zzdt zza(String str, Object obj, Object obj2, zzdq zzdqVar) {
        zzdt zzdtVar = new zzdt(str, obj, obj2, zzdqVar, null);
        zzay.add(zzdtVar);
        return zzdtVar;
    }

    public static /* bridge */ /* synthetic */ List zzb() {
        return zzay;
    }

    public static Map zzc(Context context) {
        h4 b10 = h4.b(context.getContentResolver(), o4.a("com.google.android.gms.measurement"));
        return b10 == null ? Collections.emptyMap() : b10.c();
    }
}
