package com.julien.openpaceandroidstudiotest.models;


public class eacJNI {
  public final static native int EAC_TR_VERSION_2_01_get();
  public final static native int EAC_TR_VERSION_2_02_get();
  public final static native void BUF_MEM_clear_free(long jarg1);
  public final static native int OBJ_txt2nid(String jarg1);
  public final static native void EAC_init();
  public final static native void EAC_cleanup();
  public final static native void hexdump(String jarg1, long jarg2);
  public final static native void set_tr_version(long jarg1, int jarg2);
  public final static native long get_buf(byte[] jarg1);
  public final static native void print_ossl_err();
  public final static native void CA_disable_passive_authentication(long jarg1);
  public final static native long CA_get_pubkey(long jarg1, long jarg2, long jarg3);
  public final static native long CA_STEP1_get_pubkey(long jarg1);
  public final static native long CA_STEP2_get_eph_pubkey(long jarg1);
  public final static native int CA_STEP3_check_pcd_pubkey(long jarg1, long jarg2, long jarg3);
  public final static native int CA_STEP4_compute_shared_secret(long jarg1, long jarg2);
  public final static native int CA_STEP6_derive_keys(long jarg1, long jarg2, long jarg3);
  public final static native int CA_set_key(long jarg1, byte[] jarg2, byte[] jarg4);
  public final static native int CA_STEP5_derive_keys(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long CVC_CERT_new();
  public final static native void CVC_CERT_free(long jarg1);
  public final static native long CVC_CERT_dup(long jarg1);
  public final static native short CVC_get_profile_identifier(long jarg1);
  public final static native String CVC_get_car(long jarg1);
  public final static native String CVC_get_chr(long jarg1);
  public final static native String CVC_get_effective_date(long jarg1);
  public final static native String CVC_get_expiration_date(long jarg1);
  public final static native long CVC_CERTIFICATE_DESCRIPTION_new();
  public final static native void CVC_CERTIFICATE_DESCRIPTION_free(long jarg1);
  public final static native void cvc_chat_print(long jarg1, int jarg2);
  public final static native long CVC_d2i_CVC_CERT(byte[] jarg1);
  public final static native long d2i_CVC_CERTIFICATE_DESCRIPTION(byte[] jarg1);
  public final static native long d2i_CVC_CHAT(byte[] jarg1);
  public final static native void print_binary_chat(byte[] jarg1);
  public final static native void i2d_CVC_CHAT(long jarg1, long jarg2, long jarg3);
  public final static native void get_binary_chat(long jarg1, long jarg2, long jarg3);
  public final static native void get_chat_role(long jarg1, long jarg2, long jarg3);
  public final static native void get_chat_terminal_type(long jarg1, long jarg2, long jarg3);
  public final static native void get_chat_rel_auth(long jarg1, long jarg2, long jarg3);
  public final static native void get_chat_repr(long jarg1, long jarg2, long jarg3);
  public final static native void get_cvc_repr(long jarg1, long jarg2, long jarg3);
  public final static native void CVC_CHAT_free(long jarg1);
  public final static native long cvc_get_chat(long jarg1);
  public final static native long CVC_CHAT_dup(long jarg1);
  public final static native int id_PACE_DH_GM_3DES_CBC_CBC_get();
  public final static native int id_PACE_DH_GM_AES_CBC_CMAC_128_get();
  public final static native int id_PACE_DH_GM_AES_CBC_CMAC_192_get();
  public final static native int id_PACE_DH_GM_AES_CBC_CMAC_256_get();
  public final static native int id_PACE_ECDH_GM_3DES_CBC_CBC_get();
  public final static native int id_PACE_ECDH_GM_AES_CBC_CMAC_128_get();
  public final static native int id_PACE_ECDH_GM_AES_CBC_CMAC_192_get();
  public final static native int id_PACE_ECDH_GM_AES_CBC_CMAC_256_get();
  public final static native int id_PACE_DH_IM_3DES_CBC_CBC_get();
  public final static native int id_PACE_DH_IM_AES_CBC_CMAC_128_get();
  public final static native int id_PACE_DH_IM_AES_CBC_CMAC_192_get();
  public final static native int id_PACE_DH_IM_AES_CBC_CMAC_256_get();
  public final static native int id_PACE_ECDH_IM_3DES_CBC_CBC_get();
  public final static native int id_PACE_ECDH_IM_AES_CBC_CMAC_128_get();
  public final static native int id_PACE_ECDH_IM_AES_CBC_CMAC_192_get();
  public final static native int id_PACE_ECDH_IM_AES_CBC_CMAC_256_get();
  public final static native int id_CA_DH_3DES_CBC_CBC_get();
  public final static native int id_CA_DH_AES_CBC_CMAC_128_get();
  public final static native int id_CA_DH_AES_CBC_CMAC_192_get();
  public final static native int id_CA_DH_AES_CBC_CMAC_256_get();
  public final static native int id_CA_ECDH_3DES_CBC_CBC_get();
  public final static native int id_CA_ECDH_AES_CBC_CMAC_128_get();
  public final static native int id_CA_ECDH_AES_CBC_CMAC_192_get();
  public final static native int id_CA_ECDH_AES_CBC_CMAC_256_get();
  public final static native int id_RI_DH_SHA_1_get();
  public final static native int id_RI_DH_SHA_224_get();
  public final static native int id_RI_DH_SHA_256_get();
  public final static native int id_RI_DH_SHA_384_get();
  public final static native int id_RI_DH_SHA_512_get();
  public final static native int id_RI_ECDH_SHA_1_get();
  public final static native int id_RI_ECDH_SHA_224_get();
  public final static native int id_RI_ECDH_SHA_256_get();
  public final static native int id_RI_ECDH_SHA_384_get();
  public final static native int id_RI_ECDH_SHA_512_get();
  public final static native int PACE_MRZ_get();
  public final static native long PACE_SEC_new(byte[] jarg1, int jarg3);
  public final static native void PACE_SEC_clear_free(long jarg1);
  public final static native long PACE_STEP1_enc_nonce(long jarg1, long jarg2);
  public final static native int PACE_STEP2_dec_nonce(long jarg1, long jarg2, long jarg3);
  public final static native long PACE_STEP3A_generate_mapping_data(long jarg1);
  public final static native int PACE_STEP3A_map_generator(long jarg1, long jarg2);
  public final static native long PACE_STEP3B_generate_ephemeral_key(long jarg1);
  public final static native int PACE_STEP3B_compute_shared_secret(long jarg1, long jarg2);
  public final static native long PACE_STEP3D_compute_authentication_token(long jarg1, long jarg2);
  public final static native int PACE_STEP3D_verify_authentication_token(long jarg1, long jarg2);
  public final static native int PACE_STEP3C_derive_keys(long jarg1);
  public final static native void TA_disable_checks(long jarg1);
  public final static native int TA_STEP2_import_certificate(long jarg1, long jarg2, long jarg3);
  public final static native long TA_STEP3_generate_ephemeral_key(long jarg1);
  public final static native long TA_STEP4_get_nonce(long jarg1);
  public final static native int TA_STEP4_set_nonce(long jarg1, long jarg2);
  public final static native long TA_STEP5_sign(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native int TA_STEP6_verify(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native int EAC_ID_PACE_get();
  public final static native int EAC_ID_CA_get();
  public final static native int EAC_ID_TA_get();
  public final static native int EAC_ID_EAC_get();
  public final static native long EAC_CTX_new();
  public final static native void EAC_CTX_clear_free(long jarg1);
  public final static native int EAC_CTX_init_pace(long jarg1, int jarg2, int jarg3);
  public final static native long EAC_encrypt(long jarg1, long jarg2);
  public final static native long EAC_decrypt(long jarg1, long jarg2);
  public final static native long EAC_authenticate(long jarg1, long jarg2);
  public final static native long EAC_Comp(long jarg1, int jarg2, long jarg3);
  public final static native int EAC_CTX_init_ef_cardaccess__SWIG_0(long jarg1, long jarg2, long jarg3);
  public final static native int EAC_CTX_init_ef_cardsecurity__SWIG_0(long jarg1, long jarg2, long jarg3);
  public final static native int EAC_CTX_init_ta__SWIG_0(long jarg1, long jarg2, long jarg3, long jarg4, long jarg5);
  public final static native int EAC_CTX_init_ef_cardaccess__SWIG_1(byte[] jarg1, long jarg3);
  public final static native int EAC_CTX_init_ef_cardsecurity__SWIG_1(byte[] jarg1, long jarg3);
  public final static native int EAC_CTX_init_ta__SWIG_1(long jarg1, byte[] jarg2, byte[] jarg4);
  public final static native int EAC_CTX_init_ca(long jarg1, int jarg2, int jarg3);
  public final static native int EAC_CTX_set_encryption_ctx(long jarg1, int jarg2);
  public final static native int EAC_increment_ssc(long jarg1);
  public final static native int EAC_reset_ssc(long jarg1);
  public final static native int EAC_set_ssc(long jarg1, long jarg2);
  public final static native void EAC_set_cvc_default_dir(String jarg1);
  public final static native void EAC_set_x509_default_dir(String jarg1);
}