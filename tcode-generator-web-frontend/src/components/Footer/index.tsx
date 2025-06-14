import { GithubOutlined } from '@ant-design/icons';
import { DefaultFooter } from '@ant-design/pro-components';
import '@umijs/max';
import React from 'react';

const Footer: React.FC = () => {
  const defaultMessage = 'tanjiahe';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      style={{
        background: 'none',
      }}
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'Ant Design',
          title: '编程博客',
          href: 'https://tanjiahe.icu',
          blankTarget: true,
        },
        {
          key: 'github',
          title: (
            <>
              <GithubOutlined /> jiahe-tan源码
            </>
          ),
          href: 'https://github.com/jiahe-tan-u',
          blankTarget: true,
        },
      ]}
    />
  );
};
export default Footer;
