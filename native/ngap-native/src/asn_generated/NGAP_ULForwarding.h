/*
 * Generated by asn1c-0.9.29 (http://lionet.info/asn1c)
 * From ASN.1 module "NGAP-IEs"
 * 	found in "asn/NGAP-IEs.asn"
 * 	`asn1c -fcompound-names -findirect-choice -fno-include-deps -gen-PER -no-gen-OER -no-gen-example -D ngap -pdu=all`
 */

#ifndef	_NGAP_ULForwarding_H_
#define	_NGAP_ULForwarding_H_


#include <asn_application.h>

/* Including external dependencies */
#include <NativeEnumerated.h>

#ifdef __cplusplus
extern "C" {
#endif

/* Dependencies */
typedef enum NGAP_ULForwarding {
	NGAP_ULForwarding_ul_forwarding_proposed	= 0
	/*
	 * Enumeration is extensible
	 */
} e_NGAP_ULForwarding;

/* NGAP_ULForwarding */
typedef long	 NGAP_ULForwarding_t;

/* Implementation */
extern asn_per_constraints_t asn_PER_type_NGAP_ULForwarding_constr_1;
extern asn_TYPE_descriptor_t asn_DEF_NGAP_ULForwarding;
extern const asn_INTEGER_specifics_t asn_SPC_NGAP_ULForwarding_specs_1;
asn_struct_free_f NGAP_ULForwarding_free;
asn_struct_print_f NGAP_ULForwarding_print;
asn_constr_check_f NGAP_ULForwarding_constraint;
ber_type_decoder_f NGAP_ULForwarding_decode_ber;
der_type_encoder_f NGAP_ULForwarding_encode_der;
xer_type_decoder_f NGAP_ULForwarding_decode_xer;
xer_type_encoder_f NGAP_ULForwarding_encode_xer;
per_type_decoder_f NGAP_ULForwarding_decode_uper;
per_type_encoder_f NGAP_ULForwarding_encode_uper;
per_type_decoder_f NGAP_ULForwarding_decode_aper;
per_type_encoder_f NGAP_ULForwarding_encode_aper;

#ifdef __cplusplus
}
#endif

#endif	/* _NGAP_ULForwarding_H_ */
#include <asn_internal.h>
