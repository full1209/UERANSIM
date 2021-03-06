package tr.havelsan.ueransim.ngap0.ies.sequence_ofs;

import tr.havelsan.ueransim.ngap0.core.*;
import tr.havelsan.ueransim.ngap0.pdu.*;
import tr.havelsan.ueransim.utils.bits.*;
import tr.havelsan.ueransim.utils.octets.*;
import tr.havelsan.ueransim.ngap0.ies.bit_strings.*;
import tr.havelsan.ueransim.ngap0.ies.octet_strings.*;
import tr.havelsan.ueransim.ngap0.ies.printable_strings.*;
import tr.havelsan.ueransim.ngap0.ies.sequences.*;
import tr.havelsan.ueransim.ngap0.ies.sequence_ofs.*;
import tr.havelsan.ueransim.ngap0.ies.choices.*;
import tr.havelsan.ueransim.ngap0.ies.integers.*;
import tr.havelsan.ueransim.ngap0.ies.enumerations.*;

import java.util.List;

public class NGAP_PDUSessionResourceAdmittedList extends NGAP_SequenceOf<NGAP_PDUSessionResourceAdmittedItem> {

    public NGAP_PDUSessionResourceAdmittedList() {
        super();
    }

    public NGAP_PDUSessionResourceAdmittedList(List<NGAP_PDUSessionResourceAdmittedItem> value) {
        super(value);
    }

    @Override
    public String getAsnName() {
        return "PDUSessionResourceAdmittedList";
    }

    @Override
    public String getXmlTagName() {
        return "PDUSessionResourceAdmittedList";
    }

    @Override
    public Class<NGAP_PDUSessionResourceAdmittedItem> getItemType() {
        return NGAP_PDUSessionResourceAdmittedItem.class;
    }
}
