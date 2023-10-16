package com.study.simpleboard1.service;

import com.study.simpleboard1.entity.Notice;
import com.study.simpleboard1.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor  // auto-wired
public class DetailServiceImpl implements DetailService {
    private final NoticeRepository noticeRepository;
    @Override
    public Notice detail(Long seq) {
        Notice notice = noticeRepository
                .findById(seq).orElseThrow();
        return notice;
    }
}