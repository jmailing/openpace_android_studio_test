/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.julien.openpaceandroidstudiotest;

public class eac implements eacConstants {
  public static void BUF_MEM_clear_free(SWIGTYPE_p_BUF_MEM b) {
    eacJNI.BUF_MEM_clear_free(SWIGTYPE_p_BUF_MEM.getCPtr(b));
  }

  public static int OBJ_txt2nid(String in) {
    return eacJNI.OBJ_txt2nid(in);
  }

  public static void EAC_init() {
    eacJNI.EAC_init();
  }

  public static void EAC_cleanup() {
    eacJNI.EAC_cleanup();
  }

  public static void hexdump(String title, SWIGTYPE_p_BUF_MEM s) {
    eacJNI.hexdump(title, SWIGTYPE_p_BUF_MEM.getCPtr(s));
  }

  public static void set_tr_version(SWIGTYPE_p_EAC_CTX ctx, int version) {
    eacJNI.set_tr_version(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), version);
  }

  public static SWIGTYPE_p_BUF_MEM get_buf(byte[] in) {
    long cPtr = eacJNI.get_buf(in);
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, false);
  }

  public static void print_ossl_err() {
    eacJNI.print_ossl_err();
  }

  public static void CA_disable_passive_authentication(SWIGTYPE_p_EAC_CTX ctx) {
    eacJNI.CA_disable_passive_authentication(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static SWIGTYPE_p_BUF_MEM CA_get_pubkey(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_unsigned_char in, long in_len) {
    long cPtr = eacJNI.CA_get_pubkey(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_unsigned_char.getCPtr(in), in_len);
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, true);
  }

  public static SWIGTYPE_p_BUF_MEM CA_STEP1_get_pubkey(SWIGTYPE_p_EAC_CTX ctx) {
    long cPtr = eacJNI.CA_STEP1_get_pubkey(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, true);
  }

  public static SWIGTYPE_p_BUF_MEM CA_STEP2_get_eph_pubkey(SWIGTYPE_p_EAC_CTX ctx) {
    long cPtr = eacJNI.CA_STEP2_get_eph_pubkey(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, true);
  }

  public static int CA_STEP3_check_pcd_pubkey(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM comp_pubkey, SWIGTYPE_p_BUF_MEM pubkey) {
    return eacJNI.CA_STEP3_check_pcd_pubkey(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(comp_pubkey), SWIGTYPE_p_BUF_MEM.getCPtr(pubkey));
  }

  public static int CA_STEP4_compute_shared_secret(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM pubkey) {
    return eacJNI.CA_STEP4_compute_shared_secret(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(pubkey));
  }

  public static int CA_STEP6_derive_keys(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM nonce, SWIGTYPE_p_BUF_MEM token) {
    return eacJNI.CA_STEP6_derive_keys(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(nonce), SWIGTYPE_p_BUF_MEM.getCPtr(token));
  }

  public static int CA_set_key(SWIGTYPE_p_EAC_CTX ctx, byte[] privkey, byte[] pubkey) {
    return eacJNI.CA_set_key(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), privkey, pubkey);
  }

  public static int CA_STEP5_derive_keys(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM pub, SWIGTYPE_p_p_BUF_MEM nonce, SWIGTYPE_p_p_BUF_MEM token) {
    return eacJNI.CA_STEP5_derive_keys(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(pub), SWIGTYPE_p_p_BUF_MEM.getCPtr(nonce), SWIGTYPE_p_p_BUF_MEM.getCPtr(token));
  }

  public static SWIGTYPE_p_CVC_CERT CVC_CERT_new() {
    long cPtr = eacJNI.CVC_CERT_new();
    return (cPtr == 0) ? null : new SWIGTYPE_p_CVC_CERT(cPtr, true);
  }

  public static void CVC_CERT_free(SWIGTYPE_p_CVC_CERT a) {
    eacJNI.CVC_CERT_free(SWIGTYPE_p_CVC_CERT.getCPtr(a));
  }

  public static SWIGTYPE_p_CVC_CERT CVC_CERT_dup(SWIGTYPE_p_CVC_CERT x) {
    long cPtr = eacJNI.CVC_CERT_dup(SWIGTYPE_p_CVC_CERT.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_CVC_CERT(cPtr, true);
  }

  public static short CVC_get_profile_identifier(SWIGTYPE_p_CVC_CERT cert) {
    return eacJNI.CVC_get_profile_identifier(SWIGTYPE_p_CVC_CERT.getCPtr(cert));
  }

  public static String CVC_get_car(SWIGTYPE_p_CVC_CERT cert) {
    return eacJNI.CVC_get_car(SWIGTYPE_p_CVC_CERT.getCPtr(cert));
  }

  public static String CVC_get_chr(SWIGTYPE_p_CVC_CERT cert) {
    return eacJNI.CVC_get_chr(SWIGTYPE_p_CVC_CERT.getCPtr(cert));
  }

  public static String CVC_get_effective_date(SWIGTYPE_p_CVC_CERT cert) {
    return eacJNI.CVC_get_effective_date(SWIGTYPE_p_CVC_CERT.getCPtr(cert));
  }

  public static String CVC_get_expiration_date(SWIGTYPE_p_CVC_CERT cert) {
    return eacJNI.CVC_get_expiration_date(SWIGTYPE_p_CVC_CERT.getCPtr(cert));
  }

  public static SWIGTYPE_p_CVC_CERTIFICATE_DESCRIPTION CVC_CERTIFICATE_DESCRIPTION_new() {
    long cPtr = eacJNI.CVC_CERTIFICATE_DESCRIPTION_new();
    return (cPtr == 0) ? null : new SWIGTYPE_p_CVC_CERTIFICATE_DESCRIPTION(cPtr, true);
  }

  public static void CVC_CERTIFICATE_DESCRIPTION_free(SWIGTYPE_p_CVC_CERTIFICATE_DESCRIPTION a) {
    eacJNI.CVC_CERTIFICATE_DESCRIPTION_free(SWIGTYPE_p_CVC_CERTIFICATE_DESCRIPTION.getCPtr(a));
  }

  public static void cvc_chat_print(SWIGTYPE_p_CVC_CHAT chat, int indent) {
    eacJNI.cvc_chat_print(SWIGTYPE_p_CVC_CHAT.getCPtr(chat), indent);
  }

  public static SWIGTYPE_p_CVC_CERT CVC_d2i_CVC_CERT(byte[] in) {
    long cPtr = eacJNI.CVC_d2i_CVC_CERT(in);
    return (cPtr == 0) ? null : new SWIGTYPE_p_CVC_CERT(cPtr, false);
  }

  public static SWIGTYPE_p_CVC_CERTIFICATE_DESCRIPTION d2i_CVC_CERTIFICATE_DESCRIPTION(byte[] in) {
    long cPtr = eacJNI.d2i_CVC_CERTIFICATE_DESCRIPTION(in);
    return (cPtr == 0) ? null : new SWIGTYPE_p_CVC_CERTIFICATE_DESCRIPTION(cPtr, false);
  }

  public static SWIGTYPE_p_CVC_CHAT d2i_CVC_CHAT(byte[] in) {
    long cPtr = eacJNI.d2i_CVC_CHAT(in);
    return (cPtr == 0) ? null : new SWIGTYPE_p_CVC_CHAT(cPtr, false);
  }

  public static void print_binary_chat(byte[] in) {
    eacJNI.print_binary_chat(in);
  }

  public static void i2d_CVC_CHAT(SWIGTYPE_p_CVC_CHAT chat, SWIGTYPE_p_p_char out, SWIGTYPE_p_size_t out_len) {
    eacJNI.i2d_CVC_CHAT(SWIGTYPE_p_CVC_CHAT.getCPtr(chat), SWIGTYPE_p_p_char.getCPtr(out), SWIGTYPE_p_size_t.getCPtr(out_len));
  }

  public static void get_binary_chat(SWIGTYPE_p_CVC_CHAT chat, SWIGTYPE_p_p_char out, SWIGTYPE_p_size_t out_len) {
    eacJNI.get_binary_chat(SWIGTYPE_p_CVC_CHAT.getCPtr(chat), SWIGTYPE_p_p_char.getCPtr(out), SWIGTYPE_p_size_t.getCPtr(out_len));
  }

  public static void get_chat_role(SWIGTYPE_p_CVC_CHAT chat, SWIGTYPE_p_p_char out, SWIGTYPE_p_size_t out_len) {
    eacJNI.get_chat_role(SWIGTYPE_p_CVC_CHAT.getCPtr(chat), SWIGTYPE_p_p_char.getCPtr(out), SWIGTYPE_p_size_t.getCPtr(out_len));
  }

  public static void get_chat_terminal_type(SWIGTYPE_p_CVC_CHAT chat, SWIGTYPE_p_p_char out, SWIGTYPE_p_size_t out_len) {
    eacJNI.get_chat_terminal_type(SWIGTYPE_p_CVC_CHAT.getCPtr(chat), SWIGTYPE_p_p_char.getCPtr(out), SWIGTYPE_p_size_t.getCPtr(out_len));
  }

  public static void get_chat_rel_auth(SWIGTYPE_p_CVC_CHAT chat, SWIGTYPE_p_p_char out, SWIGTYPE_p_size_t out_len) {
    eacJNI.get_chat_rel_auth(SWIGTYPE_p_CVC_CHAT.getCPtr(chat), SWIGTYPE_p_p_char.getCPtr(out), SWIGTYPE_p_size_t.getCPtr(out_len));
  }

  public static void get_chat_repr(SWIGTYPE_p_CVC_CHAT chat, SWIGTYPE_p_p_char out, SWIGTYPE_p_size_t out_len) {
    eacJNI.get_chat_repr(SWIGTYPE_p_CVC_CHAT.getCPtr(chat), SWIGTYPE_p_p_char.getCPtr(out), SWIGTYPE_p_size_t.getCPtr(out_len));
  }

  public static void get_cvc_repr(SWIGTYPE_p_CVC_CERT chat, SWIGTYPE_p_p_char out, SWIGTYPE_p_size_t out_len) {
    eacJNI.get_cvc_repr(SWIGTYPE_p_CVC_CERT.getCPtr(chat), SWIGTYPE_p_p_char.getCPtr(out), SWIGTYPE_p_size_t.getCPtr(out_len));
  }

  public static void CVC_CHAT_free(SWIGTYPE_p_CVC_CHAT arg0) {
    eacJNI.CVC_CHAT_free(SWIGTYPE_p_CVC_CHAT.getCPtr(arg0));
  }

  public static SWIGTYPE_p_CVC_CHAT cvc_get_chat(SWIGTYPE_p_CVC_CERT cvc) {
    long cPtr = eacJNI.cvc_get_chat(SWIGTYPE_p_CVC_CERT.getCPtr(cvc));
    return (cPtr == 0) ? null : new SWIGTYPE_p_CVC_CHAT(cPtr, false);
  }

  public static SWIGTYPE_p_CVC_CHAT CVC_CHAT_dup(SWIGTYPE_p_CVC_CHAT x) {
    long cPtr = eacJNI.CVC_CHAT_dup(SWIGTYPE_p_CVC_CHAT.getCPtr(x));
    return (cPtr == 0) ? null : new SWIGTYPE_p_CVC_CHAT(cPtr, true);
  }

  public static int getId_PACE_DH_GM_3DES_CBC_CBC() {
    return eacJNI.id_PACE_DH_GM_3DES_CBC_CBC_get();
  }

  public static int getId_PACE_DH_GM_AES_CBC_CMAC_128() {
    return eacJNI.id_PACE_DH_GM_AES_CBC_CMAC_128_get();
  }

  public static int getId_PACE_DH_GM_AES_CBC_CMAC_192() {
    return eacJNI.id_PACE_DH_GM_AES_CBC_CMAC_192_get();
  }

  public static int getId_PACE_DH_GM_AES_CBC_CMAC_256() {
    return eacJNI.id_PACE_DH_GM_AES_CBC_CMAC_256_get();
  }

  public static int getId_PACE_ECDH_GM_3DES_CBC_CBC() {
    return eacJNI.id_PACE_ECDH_GM_3DES_CBC_CBC_get();
  }

  public static int getId_PACE_ECDH_GM_AES_CBC_CMAC_128() {
    return eacJNI.id_PACE_ECDH_GM_AES_CBC_CMAC_128_get();
  }

  public static int getId_PACE_ECDH_GM_AES_CBC_CMAC_192() {
    return eacJNI.id_PACE_ECDH_GM_AES_CBC_CMAC_192_get();
  }

  public static int getId_PACE_ECDH_GM_AES_CBC_CMAC_256() {
    return eacJNI.id_PACE_ECDH_GM_AES_CBC_CMAC_256_get();
  }

  public static int getId_PACE_DH_IM_3DES_CBC_CBC() {
    return eacJNI.id_PACE_DH_IM_3DES_CBC_CBC_get();
  }

  public static int getId_PACE_DH_IM_AES_CBC_CMAC_128() {
    return eacJNI.id_PACE_DH_IM_AES_CBC_CMAC_128_get();
  }

  public static int getId_PACE_DH_IM_AES_CBC_CMAC_192() {
    return eacJNI.id_PACE_DH_IM_AES_CBC_CMAC_192_get();
  }

  public static int getId_PACE_DH_IM_AES_CBC_CMAC_256() {
    return eacJNI.id_PACE_DH_IM_AES_CBC_CMAC_256_get();
  }

  public static int getId_PACE_ECDH_IM_3DES_CBC_CBC() {
    return eacJNI.id_PACE_ECDH_IM_3DES_CBC_CBC_get();
  }

  public static int getId_PACE_ECDH_IM_AES_CBC_CMAC_128() {
    return eacJNI.id_PACE_ECDH_IM_AES_CBC_CMAC_128_get();
  }

  public static int getId_PACE_ECDH_IM_AES_CBC_CMAC_192() {
    return eacJNI.id_PACE_ECDH_IM_AES_CBC_CMAC_192_get();
  }

  public static int getId_PACE_ECDH_IM_AES_CBC_CMAC_256() {
    return eacJNI.id_PACE_ECDH_IM_AES_CBC_CMAC_256_get();
  }

  public static int getId_CA_DH_3DES_CBC_CBC() {
    return eacJNI.id_CA_DH_3DES_CBC_CBC_get();
  }

  public static int getId_CA_DH_AES_CBC_CMAC_128() {
    return eacJNI.id_CA_DH_AES_CBC_CMAC_128_get();
  }

  public static int getId_CA_DH_AES_CBC_CMAC_192() {
    return eacJNI.id_CA_DH_AES_CBC_CMAC_192_get();
  }

  public static int getId_CA_DH_AES_CBC_CMAC_256() {
    return eacJNI.id_CA_DH_AES_CBC_CMAC_256_get();
  }

  public static int getId_CA_ECDH_3DES_CBC_CBC() {
    return eacJNI.id_CA_ECDH_3DES_CBC_CBC_get();
  }

  public static int getId_CA_ECDH_AES_CBC_CMAC_128() {
    return eacJNI.id_CA_ECDH_AES_CBC_CMAC_128_get();
  }

  public static int getId_CA_ECDH_AES_CBC_CMAC_192() {
    return eacJNI.id_CA_ECDH_AES_CBC_CMAC_192_get();
  }

  public static int getId_CA_ECDH_AES_CBC_CMAC_256() {
    return eacJNI.id_CA_ECDH_AES_CBC_CMAC_256_get();
  }

  public static int getId_RI_DH_SHA_1() {
    return eacJNI.id_RI_DH_SHA_1_get();
  }

  public static int getId_RI_DH_SHA_224() {
    return eacJNI.id_RI_DH_SHA_224_get();
  }

  public static int getId_RI_DH_SHA_256() {
    return eacJNI.id_RI_DH_SHA_256_get();
  }

  public static int getId_RI_DH_SHA_384() {
    return eacJNI.id_RI_DH_SHA_384_get();
  }

  public static int getId_RI_DH_SHA_512() {
    return eacJNI.id_RI_DH_SHA_512_get();
  }

  public static int getId_RI_ECDH_SHA_1() {
    return eacJNI.id_RI_ECDH_SHA_1_get();
  }

  public static int getId_RI_ECDH_SHA_224() {
    return eacJNI.id_RI_ECDH_SHA_224_get();
  }

  public static int getId_RI_ECDH_SHA_256() {
    return eacJNI.id_RI_ECDH_SHA_256_get();
  }

  public static int getId_RI_ECDH_SHA_384() {
    return eacJNI.id_RI_ECDH_SHA_384_get();
  }

  public static int getId_RI_ECDH_SHA_512() {
    return eacJNI.id_RI_ECDH_SHA_512_get();
  }

  public static SWIGTYPE_p_PACE_SEC PACE_SEC_new(byte[] in, s_type type) {
    long cPtr = eacJNI.PACE_SEC_new(in, type.swigValue());
    return (cPtr == 0) ? null : new SWIGTYPE_p_PACE_SEC(cPtr, true);
  }

  public static void PACE_SEC_clear_free(SWIGTYPE_p_PACE_SEC s) {
    eacJNI.PACE_SEC_clear_free(SWIGTYPE_p_PACE_SEC.getCPtr(s));
  }

  public static SWIGTYPE_p_BUF_MEM PACE_STEP1_enc_nonce(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_PACE_SEC pi) {
    long cPtr = eacJNI.PACE_STEP1_enc_nonce(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_PACE_SEC.getCPtr(pi));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, false);
  }

  public static int PACE_STEP2_dec_nonce(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_PACE_SEC pi, SWIGTYPE_p_BUF_MEM enc_nonce) {
    return eacJNI.PACE_STEP2_dec_nonce(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_PACE_SEC.getCPtr(pi), SWIGTYPE_p_BUF_MEM.getCPtr(enc_nonce));
  }

  public static SWIGTYPE_p_BUF_MEM PACE_STEP3A_generate_mapping_data(SWIGTYPE_p_EAC_CTX ctx) {
    long cPtr = eacJNI.PACE_STEP3A_generate_mapping_data(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, false);
  }

  public static int PACE_STEP3A_map_generator(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM in) {
    return eacJNI.PACE_STEP3A_map_generator(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(in));
  }

  public static SWIGTYPE_p_BUF_MEM PACE_STEP3B_generate_ephemeral_key(SWIGTYPE_p_EAC_CTX ctx) {
    long cPtr = eacJNI.PACE_STEP3B_generate_ephemeral_key(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, false);
  }

  public static int PACE_STEP3B_compute_shared_secret(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM in) {
    return eacJNI.PACE_STEP3B_compute_shared_secret(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(in));
  }

  public static SWIGTYPE_p_BUF_MEM PACE_STEP3D_compute_authentication_token(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM pub) {
    long cPtr = eacJNI.PACE_STEP3D_compute_authentication_token(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(pub));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, false);
  }

  public static int PACE_STEP3D_verify_authentication_token(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM token) {
    return eacJNI.PACE_STEP3D_verify_authentication_token(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(token));
  }

  public static int PACE_STEP3C_derive_keys(SWIGTYPE_p_EAC_CTX ctx) {
    return eacJNI.PACE_STEP3C_derive_keys(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static void TA_disable_checks(SWIGTYPE_p_EAC_CTX ctx) {
    eacJNI.TA_disable_checks(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static int TA_STEP2_import_certificate(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_unsigned_char in, long in_len) {
    return eacJNI.TA_STEP2_import_certificate(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_unsigned_char.getCPtr(in), in_len);
  }

  public static SWIGTYPE_p_BUF_MEM TA_STEP3_generate_ephemeral_key(SWIGTYPE_p_EAC_CTX ctx) {
    long cPtr = eacJNI.TA_STEP3_generate_ephemeral_key(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, true);
  }

  public static SWIGTYPE_p_BUF_MEM TA_STEP4_get_nonce(SWIGTYPE_p_EAC_CTX ctx) {
    long cPtr = eacJNI.TA_STEP4_get_nonce(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, true);
  }

  public static int TA_STEP4_set_nonce(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM nonce) {
    return eacJNI.TA_STEP4_set_nonce(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(nonce));
  }

  public static SWIGTYPE_p_BUF_MEM TA_STEP5_sign(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM my_ta_eph_pubkey, SWIGTYPE_p_BUF_MEM opp_pace_eph_pubkey, SWIGTYPE_p_BUF_MEM auxdata) {
    long cPtr = eacJNI.TA_STEP5_sign(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(my_ta_eph_pubkey), SWIGTYPE_p_BUF_MEM.getCPtr(opp_pace_eph_pubkey), SWIGTYPE_p_BUF_MEM.getCPtr(auxdata));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, true);
  }

  public static int TA_STEP6_verify(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM opp_ta_comp_pubkey, SWIGTYPE_p_BUF_MEM my_pace_comp_eph_pubkey, SWIGTYPE_p_BUF_MEM auxdata, SWIGTYPE_p_BUF_MEM signature) {
    return eacJNI.TA_STEP6_verify(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(opp_ta_comp_pubkey), SWIGTYPE_p_BUF_MEM.getCPtr(my_pace_comp_eph_pubkey), SWIGTYPE_p_BUF_MEM.getCPtr(auxdata), SWIGTYPE_p_BUF_MEM.getCPtr(signature));
  }

  public static SWIGTYPE_p_EAC_CTX EAC_CTX_new() {
    long cPtr = eacJNI.EAC_CTX_new();
    return (cPtr == 0) ? null : new SWIGTYPE_p_EAC_CTX(cPtr, true);
  }

  public static void EAC_CTX_clear_free(SWIGTYPE_p_EAC_CTX ctx) {
    eacJNI.EAC_CTX_clear_free(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static int EAC_CTX_init_pace(SWIGTYPE_p_EAC_CTX ctx, int protocol, int curve) {
    return eacJNI.EAC_CTX_init_pace(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), protocol, curve);
  }

  public static SWIGTYPE_p_BUF_MEM EAC_encrypt(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM data) {
    long cPtr = eacJNI.EAC_encrypt(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(data));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, false);
  }

  public static SWIGTYPE_p_BUF_MEM EAC_decrypt(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM data) {
    long cPtr = eacJNI.EAC_decrypt(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(data));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, false);
  }

  public static SWIGTYPE_p_BUF_MEM EAC_authenticate(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_BUF_MEM data) {
    long cPtr = eacJNI.EAC_authenticate(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_BUF_MEM.getCPtr(data));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, false);
  }

  public static SWIGTYPE_p_BUF_MEM EAC_Comp(SWIGTYPE_p_EAC_CTX ctx, int id, SWIGTYPE_p_BUF_MEM pub) {
    long cPtr = eacJNI.EAC_Comp(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), id, SWIGTYPE_p_BUF_MEM.getCPtr(pub));
    return (cPtr == 0) ? null : new SWIGTYPE_p_BUF_MEM(cPtr, false);
  }

  public static int EAC_CTX_init_ef_cardaccess(SWIGTYPE_p_unsigned_char in, long in_len, SWIGTYPE_p_EAC_CTX ctx) {
    return eacJNI.EAC_CTX_init_ef_cardaccess__SWIG_0(SWIGTYPE_p_unsigned_char.getCPtr(in), in_len, SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static int EAC_CTX_init_ef_cardsecurity(SWIGTYPE_p_unsigned_char in, long in_len, SWIGTYPE_p_EAC_CTX ctx) {
    return eacJNI.EAC_CTX_init_ef_cardsecurity__SWIG_0(SWIGTYPE_p_unsigned_char.getCPtr(in), in_len, SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static int EAC_CTX_init_ta(SWIGTYPE_p_EAC_CTX ctx, SWIGTYPE_p_unsigned_char privkey, long privkey_len, SWIGTYPE_p_unsigned_char cert, long cert_len) {
    return eacJNI.EAC_CTX_init_ta__SWIG_0(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), SWIGTYPE_p_unsigned_char.getCPtr(privkey), privkey_len, SWIGTYPE_p_unsigned_char.getCPtr(cert), cert_len);
  }

  public static int EAC_CTX_init_ef_cardaccess(byte[] in, SWIGTYPE_p_EAC_CTX ctx) {
    return eacJNI.EAC_CTX_init_ef_cardaccess__SWIG_1(in, SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static int EAC_CTX_init_ef_cardsecurity(byte[] in, SWIGTYPE_p_EAC_CTX ctx) {
    return eacJNI.EAC_CTX_init_ef_cardsecurity__SWIG_1(in, SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static int EAC_CTX_init_ta(SWIGTYPE_p_EAC_CTX ctx, byte[] privkey, byte[] cert) {
    return eacJNI.EAC_CTX_init_ta__SWIG_1(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), privkey, cert);
  }

  public static int EAC_CTX_init_ca(SWIGTYPE_p_EAC_CTX ctx, int protocol, int curve) {
    return eacJNI.EAC_CTX_init_ca(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), protocol, curve);
  }

  public static int EAC_CTX_set_encryption_ctx(SWIGTYPE_p_EAC_CTX ctx, int id) {
    return eacJNI.EAC_CTX_set_encryption_ctx(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), id);
  }

  public static int EAC_increment_ssc(SWIGTYPE_p_EAC_CTX ctx) {
    return eacJNI.EAC_increment_ssc(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static int EAC_reset_ssc(SWIGTYPE_p_EAC_CTX ctx) {
    return eacJNI.EAC_reset_ssc(SWIGTYPE_p_EAC_CTX.getCPtr(ctx));
  }

  public static int EAC_set_ssc(SWIGTYPE_p_EAC_CTX ctx, long ssc) {
    return eacJNI.EAC_set_ssc(SWIGTYPE_p_EAC_CTX.getCPtr(ctx), ssc);
  }

  public static void EAC_set_cvc_default_dir(String default_dir) {
    eacJNI.EAC_set_cvc_default_dir(default_dir);
  }

  public static void EAC_set_x509_default_dir(String default_dir) {
    eacJNI.EAC_set_x509_default_dir(default_dir);
  }

}