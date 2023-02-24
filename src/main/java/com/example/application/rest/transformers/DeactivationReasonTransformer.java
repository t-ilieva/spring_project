package com.example.application.rest.transformers;

import com.example.application.data.entities.DeactivationReason;
import com.example.application.rest.request.DeactivationReasonRequest;
import com.example.application.rest.response.DeactivationReasonResponse;

public class DeactivationReasonTransformer {

    public DeactivationReasonResponse deactivationReasonResponse(DeactivationReason deactivationReason){
        DeactivationReasonResponse deactivationReasonResponse = new DeactivationReasonResponse();
        deactivationReasonResponse.setId(deactivationReason.getId());
        deactivationReasonResponse.setName(deactivationReason.getName());

        return deactivationReasonResponse;
    }

    public DeactivationReason deactivationReason(DeactivationReasonRequest deactivationReasonRequest){
        DeactivationReason deactivationReason = new DeactivationReason();
        deactivationReason.setName(deactivationReasonRequest.getName());

        return deactivationReason;
    }
}
